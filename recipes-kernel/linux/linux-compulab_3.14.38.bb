require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "CompuLab 3.14.38 kernel"
DESCRIPTION = "Linux kernel for CompuLab cl-som-imx6ul boards."

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_3.14.38_6ul_ga"
SRCREV = "e4944a51c4bb950a8f13e421eefc000a87350e23"
LOCALVERSION = "-imx6ul-cl-som-imx6ul"

SRC_URI += "file://defconfig \
	file://0001-ARM-i.MX6UL-dts-Add-initial-support-for-cl-som-imx6u.patch \
	file://0002-ARM-i.MX6UL-add-defconfig-for-cl-som-imx6ul.patch \
	file://0003-ARM-i.MX6UL-Add-cl-som-imx6ul-platform-driver.patch \
	file://0004-ARM-i.MX6UL-enable-cl-som-imx6ul-in-defconfig.patch \
	file://0005-Bluetooth-Add-tty-HCI-driver.patch \
	file://0006-st_kim-do-not-use-debugfs-functions-if-not-enabled.patch \
	file://0007-st_kim-allow-suspend-if-callback-is-not-registered.patch \
	file://0008-btwilink-add-minimal-device-tree-support.patch \
	file://0009-ti-st-add-device-tree-support.patch \
	file://0010-mmc-Add-SDIO-function-devicetree-subnode-parsing.patch \
	file://0011-ARM-i.MX6UL-cl-som-imx6ul-add-support-for-WiLink8.patch \
	file://0012-dt-bindings-add-TI-s-wilink-wireless-device.patch \
	file://0013-wlcore-add-device-tree-support.patch \
	file://0014-ARM-i.MX6UL-update-cl-som-imx6ul-defconfig-for-wilin.patch \
	file://0015-ARM-i.MX6UL-update-defconfig-for-cl-som-imx6ul.patch \
	file://0016-sil164-add-dvi-transmitter-simple-driver.patch \
	file://0017-ARM-imx6ul-dvi-enable-dvi-output-on-cl-sb-som.patch \
	file://0018-ARM-i.MX6UL-update-cl-som-imx6ul-defconfig-for-sil16.patch \
	file://0019-ARM-i.MX6UL-update-cl-som-imx6ul-defconfig-for-mcs78.patch \
	file://0020-ARM-i.MX6UL-rename-the-dts-files-of-cl-som-imx6ul.patch \
	file://0021-ARM-i.MX6UL-update-cl-som-imx6ul-defconfig-for-syste.patch \
	file://0022-touchscreen-ads7846-enforce-ADC-output-width.patch \
	file://0023-ARM-i.MX6UL-Fix-ESCPI2-pads-daisy-chain-input-value.patch \
	file://0024-ARM-i.MX6UL-update-cl-som-imx6ul-defconfig-for-ads78.patch \
	file://0025-ARM-i.MX6UL-update-cl-som-imx6ul-defconfig-for-WiFi-.patch \
	file://0026-ARM-i.MX6UL-add-nand-support-for-cl-som-imx6ul.patch \
	file://0027-platform-add-depends-property-handler.patch \
	file://0028-ARM-i.MX6UL-add-depends-property-to-gpmi-nand.patch \
	file://0029-ARM-i.MX6UL-add-aliases-for-cl-som-imx6ul-devices.patch \
	file://0030-ARM-i.MX6UL-tag-kernel-version-cl-som-imx6ul-1.0.patch \
"

COMPATIBLE_MACHINE = "(cl-som-imx6ul)"
