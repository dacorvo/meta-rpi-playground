DESCRIPTION = "RaspberryPi STB Packagegroup"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

inherit packagegroup

# Warning: omxplayer requires libav, which has a commercial license
RDEPENDS_${PN} = "\
    omxplayer \
"
