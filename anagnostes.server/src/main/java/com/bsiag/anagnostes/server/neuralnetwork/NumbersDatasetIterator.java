package com.bsiag.anagnostes.server.neuralnetwork;

import org.deeplearning4j.datasets.iterator.BaseDatasetIterator;

public class NumbersDatasetIterator extends BaseDatasetIterator {
	private static final long serialVersionUID = 1L;
	
	public NumbersDatasetIterator(int batch, String baseFolder, boolean train) {
		super(batch, new NumbersDataFetcher(baseFolder, train).totalExamples(), new NumbersDataFetcher(baseFolder, train));
	}
	
	public NumbersDatasetIterator(int batch, boolean train) {
		super(batch, new NumbersDataFetcher(train).totalExamples(), new NumbersDataFetcher(train));
	}
}
