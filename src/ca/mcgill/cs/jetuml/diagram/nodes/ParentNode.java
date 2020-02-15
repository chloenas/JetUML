/*******************************************************************************
 * JetUML - A desktop application for fast UML diagramming.
 *
 * Copyright (C) 2016, 2018 by the contributors of the JetUML project.
 *
 * See: https://github.com/prmr/JetUML
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package ca.mcgill.cs.jetuml.diagram.nodes;

import ca.mcgill.cs.jetuml.diagram.Node;

/**
 * Node that potentially has children nodes
 * according to a diagram type-specific parent-child
 * relation. Parent nodes control their child nodes.
 * If a ChildNode has a parent, only the parent node
 * is tracked by the graph object. If a parent node is 
 * removed from the graph, all its children are also removed. 
 * Cloning a parent node clones all the children, and similarly
 * with all other operations, including copying, translating, etc.
 */
public interface ParentNode extends Node
{}
