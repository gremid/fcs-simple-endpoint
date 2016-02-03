/**
 * This software is copyright (c) 2013-2016 by
 *  - Institut fuer Deutsche Sprache (http://www.ids-mannheim.de)
 * This is free software. You can redistribute it
 * and/or modify it under the terms described in
 * the GNU General Public License v3 of which you
 * should have received a copy. Otherwise you can download
 * it from
 *
 *   http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * @copyright Institut fuer Deutsche Sprache (http://www.ids-mannheim.de)
 *
 * @license http://www.gnu.org/licenses/gpl-3.0.txt
 *  GNU General Public License v3
 */
package eu.clarin.sru.server.fcs.parser;


/**
 * FCS-QL expression tree regex flags.
 */
public enum RegexFlag {
    /**
     * case insensitive.
     */
    CASE_INSENSITVE,
    /**
     * case sensitive.
     */
    CASE_SENSITVE,
    /**
     * match exactly (= literally).
     */
    LITERAL_MATCHING,
    /**
     * ignore all diacritics
     */
    IGNORE_DIACRITICS

} // enum RegexFlag
