/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_koblenz.oneoonecompanies.schema.impl.std;

import de.uni_koblenz.jgralab.impl.std.EdgeImpl;

import de.uni_koblenz.jgralab.EdgeDirection;
import de.uni_koblenz.jgralab.GraphIO;
import de.uni_koblenz.jgralab.GraphIOException;
import de.uni_koblenz.jgralab.NoSuchAttributeException;
import de.uni_koblenz.jgralab.Vertex;

import de.uni_koblenz.oneoonecompanies.schema.impl.std.ReversedMentorsImpl;

import java.io.IOException;
/**
 * FromVertexClass: Person
 * FromRoleName : mentor
 * ToVertexClass: Employee
 * ToRoleName : mentee
 */

public class MentorsImpl extends EdgeImpl implements de.uni_koblenz.jgralab.Edge, de.uni_koblenz.oneoonecompanies.schema.Mentors {

	public MentorsImpl(int id, de.uni_koblenz.jgralab.Graph g, Vertex alpha, Vertex omega) {
		super(id, g, alpha, omega);
	}

	public final de.uni_koblenz.jgralab.schema.AttributedElementClass getAttributedElementClass() {
		return de.uni_koblenz.oneoonecompanies.schema.OneOOneSchema.instance().ec_Mentors;
	}

	public final java.lang.Class<? extends de.uni_koblenz.jgralab.AttributedElement> getM1Class() {
		return de.uni_koblenz.oneoonecompanies.schema.Mentors.class;
	}

	public Object getAttribute(String attributeName) {
		throw new NoSuchAttributeException("Mentors doesn't contain an attribute " + attributeName);
	}

	public void setAttribute(String attributeName, Object data) {
		throw new NoSuchAttributeException("Mentors doesn't contain an attribute " + attributeName);
	}

	public void readAttributeValues(GraphIO io) throws GraphIOException {
	}

	public void readAttributeValueFromString(String attributeName, String value) throws GraphIOException {
		throw new NoSuchAttributeException("Mentors doesn't contain an attribute " + attributeName);
	}

	public void writeAttributeValues(GraphIO io) throws GraphIOException, IOException {
	}

	public String writeAttributeValueToString(String attributeName) throws IOException, GraphIOException {
		throw new NoSuchAttributeException("Mentors doesn't contain an attribute " + attributeName);
	}

	public de.uni_koblenz.oneoonecompanies.schema.Mentors getNextMentorsInGraph() {
		return (de.uni_koblenz.oneoonecompanies.schema.Mentors)getNextEdge(de.uni_koblenz.oneoonecompanies.schema.Mentors.class);
	}

	public de.uni_koblenz.oneoonecompanies.schema.Mentors getNextMentors() {
		return (de.uni_koblenz.oneoonecompanies.schema.Mentors)getNextIncidence(de.uni_koblenz.oneoonecompanies.schema.Mentors.class);
	}

	public de.uni_koblenz.oneoonecompanies.schema.Mentors getNextMentors(EdgeDirection orientation) {
		return (de.uni_koblenz.oneoonecompanies.schema.Mentors)getNextIncidence(de.uni_koblenz.oneoonecompanies.schema.Mentors.class, orientation);
	}

	public de.uni_koblenz.jgralab.schema.AggregationKind getSemantics() {
		return de.uni_koblenz.jgralab.schema.AggregationKind.NONE;
	}

	@Override
	public de.uni_koblenz.jgralab.schema.AggregationKind getAlphaSemantics() {
		return de.uni_koblenz.jgralab.schema.AggregationKind.NONE;
	}

	@Override
	public de.uni_koblenz.jgralab.schema.AggregationKind getOmegaSemantics() {
		return de.uni_koblenz.jgralab.schema.AggregationKind.NONE;
	}

	protected de.uni_koblenz.jgralab.impl.ReversedEdgeBaseImpl createReversedEdge() {
		return new ReversedMentorsImpl(this, graph);
	}
}
