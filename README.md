# Codec Info
Codec Info is a simple tool that provides detailed listing of multimedia encoders and decoders (codecs) that are available on your Android device. 

Features:

- Get info about audio codecs (max supported instances, input channels, bitrate range, sample rates and tunneled playback)
- Get info about video codecs (max resolution, frame rate, color profiles, adaptive playback, secure decryption and more)
- Easily share codec info with others

Fork from: https://github.com/Parseus/codecinfo

Adding Log Output, you can grep the following keywords with logcat. See the full output in log.txt.

```shell
❯ adb logcat | grep "@@@Codec Info"
```

```
10-21 14:58:41.220 24416 24416 D @@@Codec Info: video/avc (OMX.google.h264.decoder)
10-21 14:58:41.220 24416 24416 D @@@Codec Info: Hardware acceleration: false
10-21 14:58:41.220 24416 24416 D @@@Codec Info: Max supported instances: 32
10-21 14:58:41.220 24416 24416 D @@@Codec Info: Max resolution: 4080x2048
10-21 14:58:41.220 24416 24416 D @@@Codec Info: Max bitrate: 48 Mbps
10-21 14:58:41.220 24416 24416 D @@@Codec Info: Frame rate: 	0  960 fps
10-21 14:58:41.220 24416 24416 D @@@Codec Info: Max frame rate per resolution:
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	144p: 960.0 fps
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	144p (YouTube): 960.0 fps
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	240p: 960.0 fps
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	240p (widescreen): 960.0 fps
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	360p: 960.0 fps
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	360p (widescreen): 960.0 fps
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	480p: 960.0 fps
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	480p (widescreen): 960.0 fps
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	576p: 960.0 fps
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	720p: 546.1 fps
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	1080p: 240.9 fps
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	4K: 60.7 fps
10-21 14:58:41.220 24416 24416 D @@@Codec Info: Color profiles:
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	COLOR_FormatYUV420Flexible
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	COLOR_FormatYUV420PackedPlanar
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	COLOR_FormatYUV420PackedSemiPlanar
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	COLOR_FormatYUV420Planar
10-21 14:58:41.220 24416 24416 D @@@Codec Info: 	COLOR_FormatYUV420SemiPlanar
10-21 14:58:41.220 24416 24416 D @@@Codec Info: Adaptive playback: true
10-21 14:58:41.220 24416 24416 D @@@Codec Info: Partial frames queuing: false
10-21 14:58:41.220 24416 24416 D @@@Codec Info: Secure playback decryption: false
10-21 14:58:41.220 24416 24416 D @@@Codec Info: Dynamic timestamp: false
10-21 14:58:41.220 24416 24416 D @@@Codec Info: Multiple access units: false
10-21 14:58:41.220 24416 24416 D @@@Codec Info: Tunneled playback: false
10-21 14:58:41.220 24416 24416 D @@@Codec Info: Partial access units per input buffer: false
10-21 14:58:41.220 24416 24416 D @@@Codec Info: Profile levels:
10-21 14:58:41.220 24416 24416 D @@@Codec Info: AVCProfileConstrainedBaseline: AVCLevel52
10-21 14:58:41.220 24416 24416 D @@@Codec Info: AVCProfileBaseline: AVCLevel52
10-21 14:58:41.220 24416 24416 D @@@Codec Info: AVCProfileMain: AVCLevel52
10-21 14:58:41.220 24416 24416 D @@@Codec Info: AVCProfileConstrainedHigh: AVCLevel52
10-21 14:58:41.220 24416 24416 D @@@Codec Info: AVCProfileHigh: AVCLevel52
```
