/*
 * Copyright 2017 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package inf3143_asserts;

import java.util.List;

public class Etudiant {

    private List<Double> notes;

    public Double getMoyenne() {
        assert notes != null : "Impossible de calculer la moyenne sans notes. Voir Etudiant::setNotes(List<Double> notes)";
        Double moy = 0.0;
        for (Double note : notes) {
            moy += note;
        }
        return moy / notes.size();
    }

    public List<Double> getNotes() {
        return notes;
    }

    public void setNotes(List<Double> notes) {
        this.notes = notes;
    }

}
