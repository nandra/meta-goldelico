# This file was derived from the linux-yocto-custom.bb recipe in
# oe-core.
#
# linux-yocto-custom.bb:
#
#   A yocto-bsp-generated kernel recipe that uses the linux-yocto and
#   oe-core kernel classes to apply a subset of yocto kernel
#   management to git managed kernel repositories.
#
# Warning:
#
#   Building this kernel without providing a defconfig or BSP
#   configuration will result in build or boot errors. This is not a
#   bug.
#
# Notes:
#
#   patches: patches can be merged into to the source git tree itself,
#            added via the SRC_URI, or controlled via a BSP
#            configuration.
#
#   example configuration addition:
#            SRC_URI += "file://smp.cfg"
#   example patch addition:
#            SRC_URI += "file://0001-linux-version-tweak.patch
#   example feature addition:
#            SRC_URI += "file://feature.scc"
#

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

SRCREV="b0c4418b2ed076295b05f54701c1c63969df3e74"

SRC_URI = "git://git.goldelico.com/gta04-kernel;branch=letux-4.10-rc4"

SRC_URI += "file://defconfig"


SRC_URI += "file://goldelico.scc \
            file://goldelico.cfg \
            file://goldelico-user-config.cfg \
            file://goldelico-user-patches.scc \
           "


LINUX_VERSION ?= "4.10"
LINUX_VERSION_EXTENSION ?= "-letux"

SRCREV="${AUTOREV}"

PV = "4.10-rc4"
