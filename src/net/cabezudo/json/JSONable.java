/**
 * MIT License
 *
 * Copyright (c) 2017 Esteban Cabezudo
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.cabezudo.json;

import net.cabezudo.json.values.JSONValue;

/**
 * Enables the capability to convert an object into a JSON string representation and into a JSON java object.
 *
 * @author <a href="http://cabezudo.net">Esteban Cabezudo</a>
 * @version 1.00, 10/23/2014
 */
public interface JSONable {

  /**
   * Create a JSON string representation of this object.
   *
   * @return a <code>String</code> with a JSON string representation of the object.
   */
  String toJSON();

  /**
   * Create a JSON structure with this object.
   *
   * @return a JSON structure representation of the object.
   */
  JSONValue toJSONTree();
}
