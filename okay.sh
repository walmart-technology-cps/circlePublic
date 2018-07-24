#!/bin/bash
echo start
cd ../
echo "aha" > proof.txt
git init
git remote add origin git@github.com-bot:walmart-technology-cps/circlePublic.git
git add .
git commit -m hi
git push origin master --force
echo end