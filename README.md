PSD Slices To StyleSheet (converter)
====================================

Extract the Slices from a PSD File and create a CSS or LESS stylesheet class structure.

## Usage

    psdstss [PSD-File]* [-f css|less] [-o OUTPUT-File] [-p class-prefix]

    You can use more PSD-Files or leave it and let the script scan for all
    PSD-Files in folder. From slices the <name> will be the <css-class>,
    the <target> will be the <css-file>, in <alt-tags> are the options!
    Alt-Tag-Options can be: repeat-x, repeat-y, repeat.

      -f, --format    Set output format (css, less). Default: less
      -o, --output    The output file, if you don't want to let the script decide.
      -p, --prefix    Set the prefix of the classes. Default: sprite-
      -v, --verbose   Show information about files and parsing etc.

## Example

    psdstss sprite.psd -f less -p org-logo-

## Version history

alpha state - *not working*

v0.2 - create file writer
v0.1 - just parse the psd file


## Copyright and license

Copyright 2013 René Peschmann

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
