DESCRIPTION = "libnova is a general purpose, double precision, celestial mechanics, astrometry and astrodynamics library."
SECTION = "libraries"
DEPENDS = ""
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6e29c688d912da12b66b73e32b03d812"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI[md5sum] = "756fdb55745cb78511f83a62c25f3be4"
SRC_URI = "https://netcologne.dl.sourceforge.net/project/libnova/libnova/v%200.15.0/libnova-0.15.0.tar.gz"

S = "${WORKDIR}/libnova-0.15.0"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""
