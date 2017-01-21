
require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot which includes support for the Samsung Artik boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

PROVIDES += "u-boot"

SRCREV="dde758328c741dbaaffd0c41ca23ab31900393a4"

PV = "v2016.11+git${SRCPV}"

inherit uboot-config

SRC_URI = " \
	git://git.goldelico.com/gta04-uboot.git;branch=letux-2016.11 \
"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

