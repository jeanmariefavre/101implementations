/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_koblenz.oneoonecompanies.schema;

public interface NamedElement extends de.uni_koblenz.jgralab.Vertex {

	public java.lang.String get_name();

	public void set_name(java.lang.String _name);

	/**
	 * @return the next de.uni_koblenz.oneoonecompanies.schema.NamedElement vertex in the global vertex sequence
	 */
	public de.uni_koblenz.oneoonecompanies.schema.NamedElement getNextNamedElement();
}