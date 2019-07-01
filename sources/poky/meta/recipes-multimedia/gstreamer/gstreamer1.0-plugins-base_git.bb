DEFAULT_PREFERENCE = "-1"

include gstreamer1.0-plugins-base.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=c54ce9345727175ff66d17b67ff51f58 \
                    file://COPYING.LIB;md5=6762ed442b3822387a51c92d928ead0d \
                    file://common/coverage/coverage-report.pl;beginline=2;endline=17;md5=a4e1830fce078028c8f0974161272607"

SRC_URI = " \
    git://anongit.freedesktop.org/gstreamer/gst-plugins-base;branch=1.12;name=base \
    git://anongit.freedesktop.org/gstreamer/common;branch=1.12;destsuffix=git/common;name=common \
    file://get-caps-from-src-pad-when-query-caps.patch \
    file://0003-ssaparse-enhance-SSA-text-lines-parsing.patch \
    file://0004-subparse-set-need_segment-after-sink-pad-received-GS.patch \
    file://make-gio_unix_2_0-dependency-configurable.patch \
"

PV = "1.12.5+git${SRCPV}"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>(\d+(\.\d+)+))"

SRCREV_base = "db98c00bdfe215c6a160271beda40d36efdabcd2"
SRCREV_common = "dd9d4031075713cf37c656ce639b6d60d6f9dde3"
SRCREV_FORMAT = "base"

S = "${WORKDIR}/git"

do_configure_prepend() {
	${S}/autogen.sh --noconfigure
}
