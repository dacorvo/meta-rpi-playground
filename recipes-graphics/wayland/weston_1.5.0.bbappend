PACKAGECONFIG = " rpi-backend"
PACKAGECONFIG[rpi-backend] = "\
    --enable-rpi-compositor \
    --disable-resize-optimization \
    --disable-setuid-install \
    --disable-xwayland-test \
    --disable-simple-egl-clients \
    WESTON_NATIVE_BACKEND=rpi-backend.so\
    ,\
    --disable-rpi-compositor \
    ,\
    mtdev \
    userland \
    "
