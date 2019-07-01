# Copyright (C) 2016 - 2017 Randy Li <ayaka@soulik.info>
# Released under the GNU GENERAL PUBLIC LICENSE Version 2
# (see COPYING.GPLv2 for the terms)

DEFAULT_PREFERENCE = "-1"

include gstreamer1.0-rockchip.inc

SRCBRANCH ?= "develop"
SRCREV = "c766879e0b750233b197a2dd495e562d64498244"
SRC_URI = "git://github.com/rockchip-linux/gstreamer-rockchip.git;branch=master"

PV = "develop++git${SRCPV}"

S = "${WORKDIR}/git"
