#
# Set french keymap at init
#

DESCRIPTION = "Set french keymap at init"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"
PR = "r0"

# Add a runtime dependency to the keymaps
RDEPENDS_${PN} = "kbd-keymaps"

INITSCRIPT_NAME = "keymap-fr.sh"
INITSCRIPT_PARAMS = "start 99 S ."

# the above init param sets up
# /etc/rcS.d# ls -ltr S99keymap-fr.sh
# lrwxrwxrwx 1 root root 18 Feb 31  2000 S99keymap-fr.sh -> ../init.d/keymap-fr.sh

inherit autotools update-rc.d

SRC_URI = "file://keymap-fr.sh"

do_install () {
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/keymap-fr.sh  ${D}${sysconfdir}/init.d/keymap-fr.sh
}
