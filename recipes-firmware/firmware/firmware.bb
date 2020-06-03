# Copyright (C) 2020, STMicroelectronics - All Rights Reserved

SUMMARY = "Associated M4 Fw"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

TARGET_STM32MP1_BOARD = "STM32MP157C-DK2"
SRC_URI = " \
    file://how2eldb03110.elf \
    "

do_install () {
	install -d ${D}${prefix}/local/Cube-M4-examples/${TARGET_STM32MP1_BOARD}/Applications/la/lib/firmware
    install -m 0777 ${WORKDIR}/how2eldb03110.elf ${D}${prefix}/local/Cube-M4-examples/${TARGET_STM32MP1_BOARD}/Applications/la/lib/firmware/
}

FILES_${PN} += " ${prefix}/local/Cube-M4-examples/${TARGET_STM32MP1_BOARD}/Applications/la/lib/firmware/"
