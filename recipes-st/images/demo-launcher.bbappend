# Copyright (C) 2019, STMicroelectronics - All Rights Reserved

SUMMARY = "Skipping demo_launcher application at boot"

do_install_append () {
	chmod a-x ${D}${prefix}/local/weston-start-at-startup/start_up_demo_launcher.sh
}
