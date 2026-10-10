import os, subprocess, glob, shutil

def run(cmd):
    print(f'Running: {cmd}')
    subprocess.run(cmd, shell=True, check=True)

try:
    run('git fetch')
    
    # Fix session_8
    run('git checkout session_8')
    run('git reset --hard origin/session_8')
    run('git rm -rf "WEEK 8 ASSIGNMENT PROBLEM"')
    run('mkdir "WEEK 8 ASSIGNMENT PROBLEM"')
    # Get correct files from session_9
    run('git checkout origin/session_9 -- "WEEK 9 ASSIGNMENT PROBLEM"')
    # Move them to WEEK 8 ASSIGNMENT PROBLEM
    for f in glob.glob('WEEK 9 ASSIGNMENT PROBLEM/*'):
        shutil.move(f, 'WEEK 8 ASSIGNMENT PROBLEM/')
    run('rmdir "WEEK 9 ASSIGNMENT PROBLEM"')
    run('git add .')
    run('git commit -m "Fix: Swap Week 8 Assignment files"')
    run('git push origin session_8')

    # Fix session_9
    run('git checkout session_9')
    run('git reset --hard origin/session_9')
    run('git rm -rf "WEEK 9 ASSIGNMENT PROBLEM"')
    run('mkdir "WEEK 9 ASSIGNMENT PROBLEM"')
    # Get correct files from origin/session_8
    run('git checkout origin/session_8 -- "WEEK 8 ASSIGNMENT PROBLEM"')
    # Move them to WEEK 9 ASSIGNMENT PROBLEM
    for f in glob.glob('WEEK 8 ASSIGNMENT PROBLEM/*'):
        shutil.move(f, 'WEEK 9 ASSIGNMENT PROBLEM/')
    run('rmdir "WEEK 8 ASSIGNMENT PROBLEM"')
    run('git add .')
    run('git commit -m "Fix: Swap Week 9 Assignment files"')
    run('git push origin session_9')
    
except Exception as e:
    print(f"Error: {e}")
