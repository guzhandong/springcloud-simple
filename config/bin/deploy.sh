#!/usr/bin/env bash
d=`date +"%Y-%m-%d-%H:%M.%S"`
scp -r ../target/app.jar  root@d199:/opt/register-center/app-$d.jar
scp -r ./start.sh root@d199:/opt/register-center/start.sh