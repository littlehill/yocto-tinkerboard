PV="1.12.5"

SRC_URI_remove = " \
    file://ensure-valid-sentinels-for-gst_structure_get-etc.patch \
    file://0001-Makefile.am-don-t-hardcode-libtool-name-when-running.patch \
    file://0001-gstreamer-gl.pc.in-don-t-append-GL_CFLAGS-to-CFLAGS.patch  \
    file://0002-glplugin-enable-gldeinterlace-on-OpenGL-ES.patch \
    file://0003-glcolorconvert-implement-multiple-render-targets-for.patch \
    file://0004-glcolorconvert-don-t-use-the-predefined-variable-nam.patch \
    file://0005-glshader-add-glBindFragDataLocation.patch \
    file://0006-glcolorconvert-GLES3-deprecates-texture2D-and-it-doe.patch \
    file://0008-gl-implement-GstGLMemoryEGL.patch \
    file://0009-glimagesink-Downrank-to-marginal.patch \
"

SRC_URI += " \
    file://0011-gstreamer-gl.pc.in-don-t-append-GL_CFLAGS-to-CFLAGS.patch  \
    file://0012-Makefile.am-don-t-hardcode-libtool-name-when-running.patch \
"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
FILESPATH_prepend := "${THISDIR}/${PN}:"

SRC_URI[md5sum] = "b64d61f7329a7e663478d7641d4fa9ca"
SRC_URI[sha256sum] = "40f82fa775ce8ecfc930fd13073e8643b90cba9b6f8dd2462ec45a93120c7d81"
