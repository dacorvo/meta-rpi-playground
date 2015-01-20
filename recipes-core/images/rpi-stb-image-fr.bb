# Base this image on rpi-basic-image-fr
include recipes-core/images/rpi-basic-image-fr.bb

IMAGE_INSTALL_append = " packagegroup-rpi-stb"
