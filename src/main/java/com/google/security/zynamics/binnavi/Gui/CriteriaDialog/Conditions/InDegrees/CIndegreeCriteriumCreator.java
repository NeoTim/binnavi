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

package com.google.security.zynamics.binnavi.Gui.CriteriaDialog.Conditions.InDegrees;

import com.google.security.zynamics.binnavi.Gui.CriteriaDialog.Conditions.ICriterium;
import com.google.security.zynamics.binnavi.Gui.CriteriaDialog.Conditions.ICriteriumCreator;

/**
 * Factory class for Indegree creators.
 */
public final class CIndegreeCriteriumCreator implements ICriteriumCreator {
  @Override
  public ICriterium createCriterium() {
    return new CIndegreeCriterium();
  }

  @Override
  public String getCriteriumDescription() {
    return "Select Nodes by Indegree";
  }
}
