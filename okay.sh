#!/bin/bash
echo start
git remote add upstream git@github.com:walmart-technology-cps/circlePublic.git
git add .
git commit -m hi
git push upstream
echo end