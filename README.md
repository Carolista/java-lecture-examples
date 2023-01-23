## JAVA LECTURE EXAMPLES

If I make updates to the original repo and you've forked and cloned it previously, take the following steps to update your local copy with my changes:

```
> git remote add upstream https://github.com/Carolista/java-lecture-examples
> git fetch upstream
```

From the `main` branch:

```
git merge upstream/main
git push origin main
```

From the `solution` branch:

```
git merge upstream/solution
git push origin solution
```

