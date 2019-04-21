
# Table of contents

1. [Overview](#overview)

1. [Preliminaries](#preliminaries)

1. [Sentiment Analysis with MapReduce](#sentiment-analysis-with-mapreduce)

1. [References](#references)


# Overview


# Preliminaries

The MapReduce job is based on a Maven architype with Java 1.8.0_171 via IntelliJ IDEA 2018.3.4 Community Edition. The operating system is Ubuntu 18.04 LTS (Bionic Beaver). 

# Sentiment Analysis with MapReduce 

Given a document, we'd like to analyze the polarity of the document: is it more positive, negative or neutral? The technique can be very useful in analyzing customer reviews, social media posts and so on. Hadoop MapReduce is used to process the data in parellel with faster speed, more reliablity and more fault-tolerance. Two main interfaces are used:

* `Mapper` is used to map key/value pairs to some intermediate key/value pairs that can be applied to later interfaces. 

* `Reducer` is used to reduce the intermediate values collected from `Mapper` with shared key to a smaller set of values. Three phases of `Reducer` are shuffle, sort and reduce. See [MapReduce Tutorial](https://hadoop.apache.org/docs/r1.2.1/mapred_tutorial.html) for more details.

Sentiment analysis jobs are done with MapReduce by extending the `Mapper` and `Reducer` classes imported from `org.apache.hadoop.mapreduce ` as two classes, `SentimentSplit` and `SentimentCollection` for the mapping and reducing of the analysis. 

Two `.java` files in _SentimentAnalysis/src/java_ are used: 

* `SentimentAnalysis.java` for the MapReduce job.

* `JSONConverter.java` for converting the output file to .json file for visualization. 


# Refereces 
1. [MapReduce Tutorial](https://hadoop.apache.org/docs/r1.2.1/mapred_tutorial.html) 
2. [用 Hadoop MapReduce 进行大数据分析](https://www.ibm.com/developerworks/cn/java/j-javadev2-15/index.html)