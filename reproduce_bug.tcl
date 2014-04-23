#!/usr/bin/expect
set timeout 60

spawn bash --norc --noprofile
expect "$ "
send "grails $argv -plain-output\r"
expect "grails>"
send "shell\r"
expect ">"
send "load reproduce_bug.groovy\r"
interact
