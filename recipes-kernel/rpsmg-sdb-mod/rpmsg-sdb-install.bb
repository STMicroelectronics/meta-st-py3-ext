# Copyright (C) 2020, STMicroelectronics - All Rights Reserved

SUMMARY = "Installing the installer script"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = " \
    file://install_pkg.sh \
    "

do_install () {
    install -d ${D}${prefix}/local/weston-start-at-startup/
    install -m 0755 ${WORKDIR}/install_pkg.sh ${D}${prefix}/local/weston-start-at-startup/ 
}

FILES_${PN} += " ${prefix}/local/weston-start-at-startup/"
