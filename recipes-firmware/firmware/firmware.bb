
SUMMARY = "Associated M4 Fw"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "file://how2eldb03110.elf"

do_install () {
    install -d ${D}/lib/firmware/
    install -m 0777  ${WORKDIR}/how2eldb03110.elf  ${D}/lib/firmware/
}