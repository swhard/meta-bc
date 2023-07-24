# Used on the release 4.5 branch, for a stable version please use the "latest" recipe
VERSION_DEPENDENT_DEPENDS="python3-native python3-pystache-native python3-six-native"
VERSION_DEPENDENT_INHERIT="python3native"

# The default commit sha used if LINPHONE_SDK_REV is not set and LATEST_REVISIONS disabled
# 5.0.27
DEFAULT_COMMIT="ac2c5f4a9abbf295f3c6045d3d988a84cea752ed"
python () {
    os.environ['LINPHONE_SDK_BRANCH'] = 'release/5.2'
}
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=eb1e647870add0502f8f010b19de32af"

require linphone-sdk.inc

inherit gitpkgv

PR = "${INC_PR}.0"
PV = "5.2.x"
PKGV = "${GITPKGVTAG}"

