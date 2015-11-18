require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot which includes support for CompuLab boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://configs/cl_som_imx6ul_defconfig;md5=1bace9f05f6bef7935f30ef50e9afa6f"

PROVIDES += "u-boot"

SRCBRANCH = "master"
SRCREV = "v2015.10"
SRC_URI = "git://git.denx.de/u-boot.git;branch=${SRCBRANCH}"
SRC_URI[md5sum] = "fd8234c5b3a460430689848c1f16acef"

SRC_URI += "file://cl_som_imx6ul_defconfig \
	file://cl_som_imx6ul_nospl_defconfig \
	file://0001-arm-imx6ul-add-support-for-Compulab-cl-som-imx6ul.patch \
	file://0002-arm-imx6ul-add-extraversion-for-cl-som-imx6ul.patch \
	file://0003-arm-imx6ul-add-u-boot-with-spl-cl.imx-target-for-cl-.patch \
	file://0004-arm-imx6ul-enable-USB-Networking.patch \
	file://0005-arm-imx6ul-enable-nand-for-cl-som-imx6ul.patch \
"

S = "${WORKDIR}/git"

do_compile_append () {
	oe_runmake u-boot-with-spl-cl.imx
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "cl-som-imx6ul"
