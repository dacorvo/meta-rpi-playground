# We need to define this outside the do_install function
# since THISDIR will have a different value when it is called
# We also use the immediate expansion operator to force variable 
# expansion when this script is parsed rather than when the variable
# is used.
WESTON_CONF_FILE := "${THISDIR}/files/weston.ini"

do_install_append() {
    install -m 0644 -t ${D}/home/root ${WESTON_CONF_FILE}
}


