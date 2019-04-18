
# Table of contents

1. [Overview](#overview)

1. [Preliminaries](#preliminaries)

1. [Sentiment Analysis with MapReduce](#sentiment-analysis-with-mapreduce)

1. [References](#references)


# Overview


# Preliminaries

The MapReduce job is based on Maven architype with Java 1.8.0_171 via IntelliJ IDEA 2018.3.4 Community Edition. The operating system is Ubuntu 18.04 LTS (Bionic Beaver). 

# Sentiment Analysis with MapReduce 

Sentiment analysis jobs are done with MapReduce by extending the `Mapper` and `Reducer` classes imported from `org.apache.hadoop.mapreduce ` as two classes, `SentimentSplit` and `SentimentCollection` for the mapping and reducing of the analysis. Two `.java` files in _SentimentAnalysis/src/java_ are used: 

* `SentimentAnalysis.java` for the MapReduce job.

* `JSONConverter.java` for converting the output file to .json file for visualization. 


# Refereces 

1. [https://www.ibm.com/developerworks/cn/java/j-javadev2-15/index.html](https://www.ibm.com/developerworks/cn/java/j-javadev2-15/index.html)