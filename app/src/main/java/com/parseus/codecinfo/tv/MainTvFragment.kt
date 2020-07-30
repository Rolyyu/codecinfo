package com.parseus.codecinfo.tv

import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.leanback.app.BrowseSupportFragment
import androidx.leanback.widget.*
import com.parseus.codecinfo.R
import com.parseus.codecinfo.codecinfo.CodecSimpleInfo
import com.parseus.codecinfo.codecinfo.getSimpleCodecInfoList

class MainTvFragment : BrowseSupportFragment(), OnItemViewClickedListener {

    private lateinit var adapter: ArrayObjectAdapter

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        brandColor = ContextCompat.getColor(requireContext(), R.color.colorPrimary)
        searchAffordanceColor = ContextCompat.getColor(requireContext(), R.color.colorSecondary)
        title = getString(R.string.app_name)
        headersState = HEADERS_ENABLED
        isHeadersTransitionOnBackEnabled = true

        adapter = ArrayObjectAdapter(ListRowPresenter())
        setAdapter(adapter)

        val audioCodecList = getSimpleCodecInfoList(requireContext(), true)
        val audioPresenterHeader = HeaderItem(1, requireContext().getString(R.string.audio))
        val audioPresentAdapter = ArrayObjectAdapter(CodecPresenter(R.drawable.ic_audio))

        for (audioCodec in audioCodecList) {
            audioPresentAdapter.add(audioCodec)
        }

        adapter.add(ListRow(audioPresenterHeader, audioPresentAdapter))

        val videoCodecList = getSimpleCodecInfoList(requireContext(), false)
        val videoPresenterHeader = HeaderItem(2, requireContext().getString(R.string.video))
        val videoPresentAdapter = ArrayObjectAdapter(CodecPresenter(R.drawable.ic_video))

        for (videoCodec in videoCodecList) {
            videoPresentAdapter.add(videoCodec)
        }

        adapter.add(ListRow(videoPresenterHeader, videoPresentAdapter))
        onItemViewClickedListener = this
    }

    override fun onItemClicked(itemViewHolder: Presenter.ViewHolder?, item: Any?,
                               rowViewHolder: RowPresenter.ViewHolder?, row: Row?) {
        if (item is CodecSimpleInfo) {
            val intent = Intent(requireActivity(), TvCodecDetailsActivity::class.java).apply {
                putExtra("codecId", item.codecId)
                putExtra("codecName", item.codecName)
            }
            startActivity(intent)
        }
    }

}