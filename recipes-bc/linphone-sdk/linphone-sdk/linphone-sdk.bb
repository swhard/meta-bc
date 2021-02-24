require linphone-sdk.inc

inherit gitpkgv

PR = "${INC_PR}.0"

# based on 4.4.31
SRCREV = "46257fc55f4c43e048304fbb82e677096c201784"

# TODO set SRCREV to a fixed stable version after merge of yocto-sumo branch

# For visualisation
python () {
    print("")
    print("linphone-sdk")
    print(d.getVar('SRCREV', True))
}

# SRC_URI = "gitsm://gitlab.linphone.org/BC/public/linphone-sdk.git;protocol=https;branch=release/4.4;"
SRC_URI = "gitsm://github.com/AiflooAB/linphone-sdk.git;protocol=https;branch=master;"

PV = "git_${SRCREV}"
PKGV = "${GITPKGVTAG}"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ff3103b5db8ba4e2c66c511b7a73e407"
