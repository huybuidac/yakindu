package org.yakindu.sct.generator.genmodel.ui.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.yakindu.sct.generator.genmodel.extensions.IDefaultFeatureValueProvider;
import org.yakindu.sct.generator.genmodel.extensions.LibraryExtensions;
import org.yakindu.sct.generator.genmodel.extensions.LibraryExtensions.LibraryDescriptor;
import org.yakindu.sct.model.sgen.FeatureConfiguration;
import org.yakindu.sct.model.sgen.FeatureType;
import org.yakindu.sct.model.sgen.FeatureTypeLibrary;
import org.yakindu.sct.model.sgen.GeneratorEntry;
import org.yakindu.sct.model.sgen.GeneratorModel;
import org.yakindu.sct.model.sgen.SGenFactory;
import org.yakindu.sct.model.sgraph.Statechart;

import com.google.common.collect.Lists;

/**
 * 
 * @author muelder
 * 
 */
public class ModelCreator {

	private SGenFactory factory = SGenFactory.eINSTANCE;
	private final String generatorId;
	private final List<Statechart> statecharts;

	public ModelCreator(String generatorId, List<Statechart> statecharts) {
		this.generatorId = generatorId;
		this.statecharts = statecharts;
	}

	public GeneratorModel create() {
		GeneratorModel model = factory.createGeneratorModel();
		model.setGeneratorId(generatorId);
		for (Statechart statechart : statecharts) {
			model.getEntries().add(createGeneratorEntry(statechart));
		}
		return model;
	}

	private GeneratorEntry createGeneratorEntry(Statechart statechart) {
		GeneratorEntry entry = factory.createGeneratorEntry();
		entry.setStatechart(statechart);
		List<FeatureType> featureTypes = getFeatureTypes();
		for (FeatureType featureType : featureTypes) {
			entry.getFeatures().add(
					createFeatureConfiguration(statechart, featureType));
		}
		return entry;
	}

	private FeatureConfiguration createFeatureConfiguration(
			Statechart statechart, FeatureType featureType) {
		Iterable<LibraryDescriptor> libraryDescriptor = LibraryExtensions
				.getLibraryDescriptor(generatorId);
		for (LibraryDescriptor desc : libraryDescriptor) {
			IDefaultFeatureValueProvider defaultProvider = desc
					.createFeatureValueProvider();
			if (defaultProvider.isProviderFor(featureType.getName()))
				return defaultProvider.createDefaultFeatureConfiguration(
						featureType, statechart);
		}
		return factory.createFeatureConfiguration();
	}

	public List<FeatureType> getFeatureTypes() {
		ArrayList<FeatureType> features = Lists.newArrayList();
		Iterable<LibraryDescriptor> libraryDescriptor = LibraryExtensions
				.getLibraryDescriptor(generatorId);
		for (LibraryDescriptor desc : libraryDescriptor) {
			ResourceSet set = new ResourceSetImpl();
			Resource resource = set.getResource(desc.getURI(), true);
			FeatureTypeLibrary lib = (FeatureTypeLibrary) resource
					.getContents().get(0);
			features.addAll(lib.getTypes());
		}
		return features;
	}
}
