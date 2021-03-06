// Copyright 2011-2016 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.security.zynamics.binnavi.Gui.GraphWindows.Actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.google.common.base.Preconditions;
import com.google.security.zynamics.binnavi.CMain;
import com.google.security.zynamics.binnavi.Gui.GraphWindows.Implementations.CGraphLayouter;
import com.google.security.zynamics.binnavi.yfileswrap.zygraph.ZyGraph;


/**
 * Action class for layouting a graph in a circular way.
 */
public final class CActionCircularLayout extends AbstractAction {
  /**
   * Used for serialization.
   */
  private static final long serialVersionUID = 1238420109196271239L;

  /**
   * Parent window used for dialogs.
   */
  private final JFrame m_parent;

  /**
   * Graph to be layouted.
   */
  private final ZyGraph m_graph;

  /**
   * Creates a new action object.
   * 
   * @param parent Parent window used for dialogs.
   * @param graph Graph to be layouted.
   */
  public CActionCircularLayout(final JFrame parent, final ZyGraph graph) {
    super("Circular Layout");

    m_parent = Preconditions.checkNotNull(parent, "IE02812: parent argument can not be null");
    m_graph = Preconditions.checkNotNull(graph, "IE02813: graph argument can not be null");

    putValue(Action.SMALL_ICON, new ImageIcon(CMain.class.getResource("data/laycirc_up.jpg")));
    putValue(Action.SHORT_DESCRIPTION, "Circular Layout");

  }

  @Override
  public void actionPerformed(final ActionEvent event) {
    CGraphLayouter.doCircularLayout(m_parent, m_graph);
  }
}
