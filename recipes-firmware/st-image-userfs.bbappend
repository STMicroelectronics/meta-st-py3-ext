PACKAGE_INSTALL += "\
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'firmware', 'rpmsg-sdb-mod_1.0', '', d)} \
    "
