/*
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package pw.aru.libs.dicenotation.exceptions;

import pw.aru.libs.dicenotation.lexer.Position;

public class DiceException extends RuntimeException {
    public DiceException(String msg) {
        super(msg);
    }

    public DiceException(String msg, Position position) {
        this(msg + position);
    }

    public DiceException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public DiceException(String s, Position position, Throwable throwable) {
        super(s + position, throwable);
    }

    public DiceException(Throwable throwable) {
        super(throwable);
    }
}
