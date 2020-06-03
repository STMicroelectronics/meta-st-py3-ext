# Copyright (C) 2019, STMicroelectronics - All Rights Reserved

SUMMARY = "Installing user packages to userfs partition"

PACKAGE_INSTALL += "\
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'firmware', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'rpmsg-sdb-mod', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'rpmsg-sdb-install', '', d)} \
    "
