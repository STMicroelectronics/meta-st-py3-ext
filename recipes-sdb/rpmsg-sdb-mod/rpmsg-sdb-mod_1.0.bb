SUMMARY = "Example of how to build an external Linux kernel module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit module 

SRC_URI = "file://Makefile \
           file://stm32_rpmsg_sdb.c \
           file://install_pkg.sh \
          "

S = "${WORKDIR}"

do_install () {
    install -d ${D}${prefix}/local/weston-start-at-startup/
    install -m 0755 ${WORKDIR}/install_pkg.sh ${D}${prefix}/local/weston-start-at-startup/ 
}

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES_${PN} += "kernel-module-rpmsg-sdb"
FILES_${PN} += " ${prefix}/local/weston-start-at-startup/"

