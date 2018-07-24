#!/bin/bash
echo start
git remote set-url origin git@github.com-bot:walmart-technology-cps/circlePublic.git
git add .
git commit -m hi
git push origin master
echo end