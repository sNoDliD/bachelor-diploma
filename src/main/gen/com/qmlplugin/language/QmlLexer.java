// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: Qml.flex

package com.qmlplugin.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.qmlplugin.language.psi.QmlTypes;
import com.intellij.psi.TokenType;


class QmlLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_VALUE = 2;
  public static final int BLOCK_OF_COMMENT = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2, 2
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\2\u1f00\1\u2000\7\u1f00\1\u2100\1\u2200\1\u2300"+
    "\1\u1f00\1\u2400\1\u2500\2\u1f00\31\u0100\1\u2600\121\u0100\1\u2700"+
    "\4\u0100\1\u2800\1\u0100\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00"+
    "\1\u2e00\53\u0100\1\u2f00\10\u3000\31\u1f00\1\u0100\1\u3100\1\u3200"+
    "\1\u0100\1\u3300\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900"+
    "\1\u3a00\1\u3b00\1\u0100\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000"+
    "\1\u4100\1\u4200\1\u1f00\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700"+
    "\1\u4800\1\u4900\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u4e00\1\u1f00"+
    "\1\u4f00\1\u5000\1\u5100\1\u1f00\3\u0100\1\u5200\1\u5300\1\u5400"+
    "\12\u1f00\4\u0100\1\u5500\17\u1f00\2\u0100\1\u5600\41\u1f00\2\u0100"+
    "\1\u5700\1\u5800\2\u1f00\1\u5900\1\u5a00\27\u0100\1\u5b00\2\u0100"+
    "\1\u5c00\45\u1f00\1\u0100\1\u5d00\1\u5e00\11\u1f00\1\u5f00\24\u1f00"+
    "\1\u6000\1\u6100\1\u1f00\1\u6200\1\u6300\1\u6400\1\u6500\2\u1f00"+
    "\1\u6600\5\u1f00\1\u6700\1\u6800\1\u6900\5\u1f00\1\u6a00\1\u6b00"+
    "\4\u1f00\1\u6c00\2\u1f00\1\u6d00\16\u1f00\246\u0100\1\u6e00\20\u0100"+
    "\1\u6f00\1\u7000\25\u0100\1\u7100\34\u0100\1\u7200\14\u1f00\2\u0100"+
    "\1\u7300\u0b06\u1f00\1\u2700\u02fe\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\4\1\5\22\0\1\1"+
    "\1\6\1\7\2\0\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\12\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\0\1\32\1\33"+
    "\17\32\1\34\10\32\1\35\1\36\1\37\1\0\1\32"+
    "\1\0\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\2\32\1\51\1\52\1\53\1\54\1\55"+
    "\1\32\1\56\1\57\1\60\1\61\1\62\1\63\1\32"+
    "\1\64\1\65\1\66\1\67\1\70\7\0\1\3\44\0"+
    "\1\71\12\0\1\71\4\0\1\71\5\0\27\71\1\0"+
    "\37\71\1\0\u01ca\71\4\0\14\71\16\0\5\71\7\0"+
    "\1\71\1\0\1\71\21\0\165\71\1\0\2\71\2\0"+
    "\4\71\1\0\1\71\6\0\1\71\1\0\3\71\1\0"+
    "\1\71\1\0\24\71\1\0\123\71\1\0\213\71\1\0"+
    "\255\71\1\0\46\71\2\0\1\71\6\0\51\71\10\0"+
    "\55\71\1\0\1\71\1\0\2\71\1\0\2\71\1\0"+
    "\1\71\10\0\33\71\4\0\4\71\35\0\13\71\5\0"+
    "\100\71\12\23\4\0\146\71\1\0\10\71\2\0\12\71"+
    "\1\0\6\71\12\23\3\71\2\0\1\71\20\0\73\71"+
    "\2\0\145\71\16\0\12\23\54\71\4\0\1\71\2\0"+
    "\1\71\2\0\56\71\22\0\34\71\4\0\13\71\65\0"+
    "\25\71\1\0\10\71\25\0\17\71\1\0\201\71\2\0"+
    "\12\23\1\0\23\71\1\0\10\71\2\0\2\71\2\0"+
    "\26\71\1\0\7\71\1\0\1\71\3\0\4\71\2\0"+
    "\11\71\2\0\2\71\2\0\4\71\10\0\1\71\4\0"+
    "\2\71\1\0\5\71\2\0\12\23\2\71\12\0\1\71"+
    "\1\0\1\71\2\0\3\71\1\0\6\71\4\0\2\71"+
    "\2\0\26\71\1\0\7\71\1\0\2\71\1\0\2\71"+
    "\1\0\2\71\2\0\1\71\1\0\5\71\4\0\2\71"+
    "\2\0\3\71\3\0\1\71\7\0\4\71\1\0\1\71"+
    "\7\0\12\23\6\71\13\0\3\71\1\0\11\71\1\0"+
    "\3\71\1\0\26\71\1\0\7\71\1\0\2\71\1\0"+
    "\5\71\2\0\12\71\1\0\3\71\1\0\3\71\2\0"+
    "\1\71\17\0\4\71\2\0\12\23\11\0\7\71\1\0"+
    "\3\71\1\0\10\71\2\0\2\71\2\0\26\71\1\0"+
    "\7\71\1\0\2\71\1\0\5\71\2\0\11\71\2\0"+
    "\2\71\2\0\3\71\10\0\2\71\4\0\2\71\1\0"+
    "\5\71\2\0\12\23\1\0\1\71\20\0\2\71\1\0"+
    "\6\71\3\0\3\71\1\0\4\71\3\0\2\71\1\0"+
    "\1\71\1\0\2\71\3\0\2\71\3\0\3\71\3\0"+
    "\14\71\4\0\5\71\3\0\3\71\1\0\4\71\2\0"+
    "\1\71\6\0\1\71\16\0\12\23\20\0\15\71\1\0"+
    "\3\71\1\0\27\71\1\0\20\71\3\0\10\71\1\0"+
    "\3\71\1\0\4\71\7\0\2\71\1\0\3\71\5\0"+
    "\4\71\2\0\12\23\20\0\4\71\1\0\10\71\1\0"+
    "\3\71\1\0\27\71\1\0\12\71\1\0\5\71\2\0"+
    "\11\71\1\0\3\71\1\0\4\71\7\0\2\71\7\0"+
    "\1\71\1\0\4\71\2\0\12\23\1\0\2\71\15\0"+
    "\4\71\1\0\10\71\1\0\3\71\1\0\63\71\1\0"+
    "\3\71\1\0\5\71\5\0\4\71\7\0\5\71\2\0"+
    "\12\23\12\0\6\71\2\0\2\71\1\0\22\71\3\0"+
    "\30\71\1\0\11\71\1\0\1\71\2\0\7\71\3\0"+
    "\1\71\4\0\6\71\1\0\1\71\1\0\10\71\6\0"+
    "\12\23\2\0\2\71\15\0\72\71\5\0\17\71\1\0"+
    "\12\23\47\0\2\71\1\0\1\71\1\0\5\71\1\0"+
    "\30\71\1\0\1\71\1\0\27\71\2\0\5\71\1\0"+
    "\1\71\1\0\6\71\2\0\12\23\2\0\4\71\40\0"+
    "\1\71\27\0\2\71\6\0\12\23\13\0\1\71\1\0"+
    "\1\71\1\0\1\71\4\0\12\71\1\0\44\71\4\0"+
    "\24\71\1\0\22\71\1\0\44\71\11\0\1\71\71\0"+
    "\100\71\12\23\6\0\100\71\12\23\4\71\2\0\46\71"+
    "\1\0\1\71\5\0\1\71\2\0\53\71\1\0\115\71"+
    "\1\0\4\71\2\0\7\71\1\0\1\71\1\0\4\71"+
    "\2\0\51\71\1\0\4\71\2\0\41\71\1\0\4\71"+
    "\2\0\7\71\1\0\1\71\1\0\4\71\2\0\17\71"+
    "\1\0\71\71\1\0\4\71\2\0\103\71\2\0\3\71"+
    "\40\0\20\71\20\0\126\71\2\0\6\71\3\0\u016c\71"+
    "\2\0\21\71\1\0\32\71\5\0\113\71\3\0\13\71"+
    "\7\0\15\71\1\0\7\71\13\0\25\71\13\0\24\71"+
    "\14\0\15\71\1\0\3\71\1\0\2\71\14\0\124\71"+
    "\3\0\1\71\4\0\2\71\2\0\12\23\41\0\3\71"+
    "\2\0\12\23\6\0\131\71\7\0\53\71\5\0\106\71"+
    "\12\0\37\71\1\0\14\71\4\0\14\71\12\0\12\23"+
    "\36\71\2\0\5\71\13\0\54\71\4\0\32\71\6\0"+
    "\12\23\46\0\34\71\4\0\77\71\1\0\35\71\2\0"+
    "\1\71\12\23\6\0\12\23\15\0\1\71\10\0\17\71"+
    "\101\0\114\71\4\0\12\23\21\0\11\71\14\0\60\71"+
    "\12\23\72\71\14\0\70\71\10\0\12\23\3\0\3\71"+
    "\12\23\44\71\2\0\11\71\7\0\53\71\2\0\3\71"+
    "\20\0\3\71\1\0\47\71\5\0\372\71\1\0\33\71"+
    "\2\0\6\71\2\0\46\71\2\0\6\71\2\0\10\71"+
    "\1\0\1\71\1\0\1\71\1\0\1\71\1\0\37\71"+
    "\2\0\65\71\1\0\7\71\1\0\1\71\3\0\3\71"+
    "\1\0\7\71\3\0\4\71\2\0\6\71\4\0\15\71"+
    "\5\0\3\71\1\0\7\71\53\0\2\3\25\0\2\71"+
    "\23\0\1\71\34\0\1\71\15\0\1\71\20\0\15\71"+
    "\63\0\41\71\21\0\1\71\4\0\1\71\2\0\12\71"+
    "\1\0\1\71\3\0\5\71\6\0\1\71\1\0\1\71"+
    "\1\0\1\71\1\0\4\71\1\0\13\71\2\0\4\71"+
    "\5\0\5\71\4\0\1\71\21\0\51\71\u022d\0\64\71"+
    "\26\0\57\71\1\0\57\71\1\0\205\71\6\0\11\71"+
    "\14\0\46\71\1\0\1\71\5\0\1\71\2\0\70\71"+
    "\7\0\1\71\17\0\30\71\11\0\7\71\1\0\7\71"+
    "\1\0\7\71\1\0\7\71\1\0\7\71\1\0\7\71"+
    "\1\0\7\71\1\0\7\71\1\0\40\71\57\0\1\71"+
    "\325\0\3\71\31\0\17\71\1\0\5\71\2\0\5\71"+
    "\4\0\126\71\2\0\2\71\2\0\3\71\1\0\132\71"+
    "\1\0\4\71\5\0\53\71\1\0\136\71\21\0\33\71"+
    "\65\0\306\71\112\0\360\71\20\0\215\71\103\0\56\71"+
    "\2\0\15\71\3\0\20\71\12\23\2\71\24\0\63\71"+
    "\1\0\12\71\1\0\163\71\45\0\11\71\2\0\147\71"+
    "\2\0\65\71\2\0\5\71\60\0\61\71\30\0\64\71"+
    "\14\0\106\71\12\0\12\23\6\0\30\71\3\0\1\71"+
    "\1\0\3\71\12\23\44\71\2\0\44\71\14\0\35\71"+
    "\3\0\101\71\16\0\1\71\12\23\6\0\20\71\12\23"+
    "\5\71\1\0\67\71\11\0\16\71\2\0\12\23\6\0"+
    "\27\71\3\0\111\71\30\0\3\71\2\0\20\71\2\0"+
    "\5\71\12\0\6\71\2\0\6\71\2\0\6\71\11\0"+
    "\7\71\1\0\7\71\1\0\53\71\1\0\14\71\10\0"+
    "\173\71\1\0\2\71\2\0\12\23\6\0\244\71\14\0"+
    "\27\71\4\0\61\71\4\0\u0100\3\156\71\2\0\152\71"+
    "\46\0\7\71\14\0\5\71\5\0\14\71\1\0\15\71"+
    "\1\0\5\71\1\0\1\71\1\0\2\71\1\0\2\71"+
    "\1\0\154\71\41\0\153\71\22\0\100\71\2\0\66\71"+
    "\50\0\14\71\4\0\20\71\20\0\20\71\3\0\2\71"+
    "\30\0\3\71\40\0\5\71\1\0\207\71\23\0\12\23"+
    "\7\0\32\71\4\0\1\71\1\0\32\71\13\0\131\71"+
    "\3\0\6\71\2\0\6\71\2\0\6\71\2\0\3\71"+
    "\43\0\14\71\1\0\32\71\1\0\23\71\1\0\2\71"+
    "\1\0\17\71\2\0\16\71\42\0\173\71\105\0\65\71"+
    "\210\0\1\71\202\0\35\71\3\0\61\71\17\0\1\71"+
    "\37\0\40\71\15\0\36\71\5\0\53\71\5\0\36\71"+
    "\2\0\44\71\4\0\10\71\1\0\5\71\52\0\236\71"+
    "\2\0\12\23\6\0\44\71\4\0\44\71\4\0\50\71"+
    "\10\0\64\71\234\0\67\71\11\0\26\71\12\0\10\71"+
    "\230\0\6\71\2\0\1\71\1\0\54\71\1\0\2\71"+
    "\3\0\1\71\2\0\27\71\12\0\27\71\11\0\37\71"+
    "\101\0\23\71\1\0\2\71\12\0\26\71\12\0\32\71"+
    "\106\0\70\71\6\0\2\71\100\0\4\71\1\0\2\71"+
    "\5\0\10\71\1\0\3\71\1\0\35\71\2\0\3\71"+
    "\4\0\1\71\40\0\35\71\3\0\35\71\43\0\10\71"+
    "\1\0\36\71\31\0\66\71\12\0\26\71\12\0\23\71"+
    "\15\0\22\71\156\0\111\71\67\0\63\71\15\0\63\71"+
    "\15\0\50\71\10\0\12\23\306\0\35\71\12\0\1\71"+
    "\10\0\41\71\217\0\27\71\11\0\107\71\37\0\12\23"+
    "\17\0\74\71\25\0\31\71\7\0\12\23\6\0\65\71"+
    "\1\0\12\23\4\0\3\71\11\0\44\71\2\0\1\71"+
    "\11\0\105\71\4\0\4\71\3\0\12\23\1\71\1\0"+
    "\1\71\43\0\22\71\1\0\45\71\6\0\1\71\101\0"+
    "\7\71\1\0\1\71\1\0\4\71\1\0\17\71\1\0"+
    "\12\71\7\0\73\71\5\0\12\23\6\0\4\71\1\0"+
    "\10\71\2\0\2\71\2\0\26\71\1\0\7\71\1\0"+
    "\2\71\1\0\5\71\1\0\12\71\2\0\2\71\2\0"+
    "\3\71\2\0\1\71\6\0\1\71\5\0\7\71\2\0"+
    "\7\71\3\0\5\71\213\0\113\71\5\0\12\23\4\0"+
    "\2\71\40\0\106\71\1\0\1\71\10\0\12\23\246\0"+
    "\66\71\2\0\11\71\27\0\6\71\42\0\101\71\3\0"+
    "\1\71\13\0\12\23\46\0\71\71\7\0\12\23\66\0"+
    "\33\71\2\0\17\71\4\0\12\23\306\0\73\71\145\0"+
    "\100\71\12\23\25\0\1\71\240\0\10\71\2\0\56\71"+
    "\2\0\10\71\1\0\2\71\33\0\77\71\10\0\1\71"+
    "\10\0\112\71\3\0\1\71\42\0\71\71\7\0\11\71"+
    "\1\0\55\71\1\0\11\71\17\0\12\23\30\0\36\71"+
    "\2\0\26\71\1\0\16\71\111\0\7\71\1\0\2\71"+
    "\1\0\54\71\3\0\1\71\1\0\2\71\1\0\11\71"+
    "\10\0\12\23\6\0\6\71\1\0\2\71\1\0\45\71"+
    "\1\0\2\71\1\0\6\71\7\0\12\23\u0136\0\27\71"+
    "\11\0\232\71\146\0\157\71\21\0\304\71\274\0\57\71"+
    "\321\0\107\71\271\0\71\71\7\0\37\71\1\0\12\23"+
    "\146\0\36\71\2\0\5\71\13\0\67\71\11\0\4\71"+
    "\14\0\12\23\11\0\25\71\5\0\23\71\260\0\100\71"+
    "\200\0\113\71\4\0\71\71\7\0\21\71\100\0\2\71"+
    "\1\0\1\71\34\0\370\71\10\0\363\71\15\0\37\71"+
    "\61\0\3\71\21\0\4\71\10\0\u018c\71\4\0\153\71"+
    "\5\0\15\71\3\0\11\71\7\0\12\71\3\0\2\71"+
    "\306\0\5\71\3\0\6\71\10\0\10\71\2\0\7\71"+
    "\36\0\4\71\224\0\3\71\273\0\125\71\1\0\107\71"+
    "\1\0\2\71\2\0\1\71\2\0\2\71\2\0\4\71"+
    "\1\0\14\71\1\0\1\71\1\0\7\71\1\0\101\71"+
    "\1\0\4\71\2\0\10\71\1\0\7\71\1\0\34\71"+
    "\1\0\4\71\1\0\5\71\1\0\1\71\3\0\7\71"+
    "\1\0\u0154\71\2\0\31\71\1\0\31\71\1\0\37\71"+
    "\1\0\31\71\1\0\37\71\1\0\31\71\1\0\37\71"+
    "\1\0\31\71\1\0\37\71\1\0\31\71\1\0\10\71"+
    "\2\0\62\23\67\71\4\0\62\71\10\0\1\71\16\0"+
    "\1\71\26\0\5\71\1\0\17\71\120\0\7\71\1\0"+
    "\21\71\2\0\7\71\1\0\2\71\1\0\5\71\325\0"+
    "\55\71\3\0\16\71\2\0\12\23\4\0\1\71\u0171\0"+
    "\60\71\12\23\6\0\305\71\13\0\7\71\51\0\114\71"+
    "\4\0\12\23\246\0\4\71\1\0\33\71\1\0\2\71"+
    "\1\0\1\71\2\0\1\71\1\0\12\71\1\0\4\71"+
    "\1\0\1\71\1\0\1\71\6\0\1\71\4\0\1\71"+
    "\1\0\1\71\1\0\1\71\1\0\3\71\1\0\2\71"+
    "\1\0\1\71\2\0\1\71\1\0\1\71\1\0\1\71"+
    "\1\0\1\71\1\0\1\71\1\0\2\71\1\0\1\71"+
    "\2\0\4\71\1\0\7\71\1\0\4\71\1\0\4\71"+
    "\1\0\1\71\1\0\12\71\1\0\21\71\5\0\3\71"+
    "\1\0\5\71\1\0\21\71\164\0\32\71\6\0\32\71"+
    "\6\0\32\71\166\0\327\71\51\0\65\71\13\0\336\71"+
    "\2\0\u0182\71\16\0\u0131\71\37\0\36\71\342\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[29696];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\2\3\1\4\1\1\1\5\1\6"+
    "\1\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\2\26\1\3\1\27\1\30\20\26\1\31\1\32\1\33"+
    "\2\34\1\35\1\0\1\36\1\0\1\37\2\0\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\2\26\1\46\33\26"+
    "\1\47\1\41\1\50\1\51\14\26\1\52\17\26\1\46"+
    "\32\26";

  private static int [] zzUnpackAction() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\72\0\164\0\256\0\350\0\256\0\350\0\u0122"+
    "\0\u015c\0\256\0\u0196\0\u01d0\0\256\0\256\0\256\0\256"+
    "\0\256\0\256\0\256\0\u020a\0\u0244\0\256\0\256\0\u027e"+
    "\0\u02b8\0\u02f2\0\256\0\u032c\0\u0366\0\u032c\0\256\0\256"+
    "\0\u03a0\0\u03da\0\u0414\0\u044e\0\u0488\0\u04c2\0\u04fc\0\u0536"+
    "\0\u0570\0\u05aa\0\u05e4\0\u061e\0\u0658\0\u0692\0\u06cc\0\u0706"+
    "\0\256\0\u0740\0\256\0\256\0\u077a\0\u07b4\0\u015c\0\256"+
    "\0\u07ee\0\256\0\u01d0\0\u0828\0\256\0\u0862\0\u089c\0\256"+
    "\0\u08d6\0\256\0\u0910\0\u094a\0\u032c\0\u0984\0\u09be\0\u09f8"+
    "\0\u0a32\0\u0a6c\0\u0aa6\0\u0ae0\0\u0b1a\0\u0b54\0\u0b8e\0\u0bc8"+
    "\0\u0c02\0\u0c3c\0\u0c76\0\u0cb0\0\u0cea\0\u0d24\0\u0d5e\0\u0d98"+
    "\0\u0dd2\0\u0e0c\0\u0e46\0\u0e80\0\u0eba\0\u0ef4\0\u0f2e\0\u0f68"+
    "\0\256\0\256\0\256\0\256\0\u0fa2\0\u0fdc\0\u1016\0\u1050"+
    "\0\u108a\0\u10c4\0\u10fe\0\u1138\0\u1172\0\u11ac\0\u11e6\0\u1220"+
    "\0\u032c\0\u125a\0\u1294\0\u12ce\0\u1308\0\u1342\0\u137c\0\u13b6"+
    "\0\u13f0\0\u142a\0\u1464\0\u149e\0\u14d8\0\u1512\0\u154c\0\u1586"+
    "\0\u15c0\0\u15fa\0\u1634\0\u166e\0\u16a8\0\u16e2\0\u171c\0\u1756"+
    "\0\u1790\0\u17ca\0\u1804\0\u183e\0\u1878\0\u18b2\0\u18ec\0\u1926"+
    "\0\u1960\0\u199a\0\u19d4\0\u1a0e\0\u1a48\0\u1a82\0\u1abc\0\u1af6"+
    "\0\u1b30\0\u1b6a\0\u1ba4";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\4\1\7\1\4\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\4\1\40"+
    "\1\41\1\34\1\42\1\43\1\44\1\45\2\34\1\46"+
    "\1\47\1\34\1\50\1\51\1\52\1\53\1\54\1\55"+
    "\1\56\1\57\1\60\2\34\1\61\1\62\1\63\3\4"+
    "\1\6\1\4\1\6\27\4\1\6\35\4\15\64\1\65"+
    "\54\64\73\0\1\5\2\0\1\5\114\0\1\66\42\0"+
    "\7\67\1\70\26\67\1\71\33\67\11\0\1\72\60\0"+
    "\12\73\1\70\23\73\1\74\33\73\15\0\1\75\4\0"+
    "\1\76\70\0\1\77\1\0\1\25\75\0\1\100\71\0"+
    "\1\101\71\0\1\102\65\0\1\34\6\0\3\34\3\0"+
    "\26\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\4\34\1\103\21\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\11\34\1\104\5\34\1\105\6\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\1\106\13\34"+
    "\1\107\11\34\3\0\1\34\23\0\1\34\6\0\3\34"+
    "\3\0\1\110\3\34\1\111\7\34\1\112\11\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\11\34\1\113"+
    "\1\34\1\114\12\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\1\115\7\34\1\116\10\34\1\117\4\34"+
    "\3\0\1\34\23\0\1\34\6\0\3\34\3\0\5\34"+
    "\1\105\4\34\1\120\1\121\12\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\4\34\1\122\3\34\1\123"+
    "\15\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\4\34\1\124\14\34\1\125\4\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\13\34\1\105\12\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\14\34\1\126"+
    "\1\34\1\127\7\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\4\34\1\130\21\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\10\34\1\131\7\34\1\132"+
    "\2\34\1\133\2\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\7\34\1\134\6\34\1\135\7\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\16\34\1\136"+
    "\7\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\1\137\25\34\3\0\1\34\23\0\1\34\6\0\3\34"+
    "\3\0\7\34\1\140\16\34\3\0\1\34\67\0\1\141"+
    "\24\0\1\142\76\0\1\143\42\0\2\67\4\0\64\67"+
    "\2\73\4\0\64\73\2\76\1\0\2\76\1\0\64\76"+
    "\23\0\1\77\75\0\1\144\65\0\1\34\6\0\3\34"+
    "\3\0\7\34\1\145\16\34\3\0\1\34\23\0\1\34"+
    "\6\0\3\34\3\0\10\34\1\146\15\34\3\0\1\34"+
    "\23\0\1\34\6\0\3\34\3\0\17\34\1\147\1\150"+
    "\5\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\13\34\1\151\12\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\20\34\1\152\5\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\5\34\1\153\20\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\21\34\1\154"+
    "\4\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\17\34\1\147\6\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\21\34\1\155\4\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\11\34\1\113\14\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\13\34\1\156"+
    "\12\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\13\34\1\157\12\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\15\34\1\160\10\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\20\34\1\161\5\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\20\34\1\105"+
    "\5\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\17\34\1\121\6\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\23\34\1\105\2\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\11\34\1\162\14\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\10\34\1\163"+
    "\15\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\14\34\1\164\11\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\1\165\1\34\1\121\15\34\1\166\5\34"+
    "\3\0\1\34\23\0\1\34\6\0\3\34\3\0\6\34"+
    "\1\167\16\34\1\152\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\16\34\1\170\7\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\10\34\1\171\15\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\16\34\1\172"+
    "\7\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\21\34\1\147\2\34\1\105\1\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\11\34\1\161\14\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\16\34\1\161"+
    "\7\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\10\34\1\173\15\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\1\174\25\34\3\0\1\34\23\0\1\34"+
    "\6\0\3\34\3\0\1\175\25\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\4\34\1\105\21\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\2\34\1\176"+
    "\23\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\17\34\1\122\6\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\4\34\1\161\21\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\1\177\25\34\3\0\1\34"+
    "\23\0\1\34\6\0\3\34\3\0\1\34\1\200\24\34"+
    "\3\0\1\34\23\0\1\34\6\0\3\34\3\0\12\34"+
    "\1\201\13\34\3\0\1\34\23\0\1\34\6\0\3\34"+
    "\3\0\1\202\25\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\2\34\1\203\23\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\14\34\1\204\11\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\11\34\1\105"+
    "\14\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\13\34\1\121\12\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\15\34\1\205\10\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\3\34\1\206\5\34\1\161"+
    "\14\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\21\34\1\207\4\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\13\34\1\210\12\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\10\34\1\211\15\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\20\34\1\150"+
    "\5\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\14\34\1\124\11\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\11\34\1\147\14\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\22\34\1\212\3\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\17\34\1\105"+
    "\6\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\7\34\1\105\16\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\21\34\1\213\4\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\11\34\1\152\14\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\4\34\1\214"+
    "\21\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\11\34\1\215\14\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\20\34\1\216\5\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\16\34\1\122\7\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\4\34\1\217"+
    "\21\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\14\34\1\220\11\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\16\34\1\51\7\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\1\162\25\34\3\0\1\34"+
    "\23\0\1\34\6\0\3\34\3\0\13\34\1\221\12\34"+
    "\3\0\1\34\23\0\1\34\6\0\3\34\3\0\10\34"+
    "\1\222\15\34\3\0\1\34\23\0\1\34\6\0\3\34"+
    "\3\0\11\34\1\122\14\34\3\0\1\34\23\0\1\34"+
    "\6\0\3\34\3\0\16\34\1\223\7\34\3\0\1\34"+
    "\23\0\1\34\6\0\3\34\3\0\11\34\1\224\14\34"+
    "\3\0\1\34\23\0\1\34\6\0\3\34\3\0\10\34"+
    "\1\225\15\34\3\0\1\34\23\0\1\34\6\0\3\34"+
    "\3\0\16\34\1\226\7\34\3\0\1\34\23\0\1\34"+
    "\6\0\3\34\3\0\13\34\1\215\12\34\3\0\1\34"+
    "\23\0\1\34\6\0\3\34\3\0\6\34\1\161\17\34"+
    "\3\0\1\34\23\0\1\34\6\0\3\34\3\0\14\34"+
    "\1\227\11\34\3\0\1\34\23\0\1\34\6\0\3\34"+
    "\3\0\1\230\25\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\24\34\1\105\1\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\14\34\1\51\11\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\20\34\1\224"+
    "\5\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\16\34\1\105\7\34\3\0\1\34\23\0\1\34\6\0"+
    "\3\34\3\0\20\34\1\231\5\34\3\0\1\34\23\0"+
    "\1\34\6\0\3\34\3\0\10\34\1\232\15\34\3\0"+
    "\1\34\23\0\1\34\6\0\3\34\3\0\14\34\1\233"+
    "\11\34\3\0\1\34\23\0\1\34\6\0\3\34\3\0"+
    "\13\34\1\161\12\34\3\0\1\34";

  private static int [] zzUnpacktrans() {
    int [] result = new int[7134];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\1\1\1\11\3\1\1\11\2\1\7\11"+
    "\2\1\2\11\3\1\1\11\3\1\2\11\20\1\1\11"+
    "\1\1\2\11\2\1\1\0\1\11\1\0\1\11\2\0"+
    "\1\11\2\1\1\11\1\1\1\11\36\1\4\11\67\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  QmlLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return TokenType.BAD_CHARACTER;
            }
          // fall through
          case 43: break;
          case 2:
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            }
          // fall through
          case 44: break;
          case 3:
            { yybegin(YYINITIAL); return QmlTypes.NEW_LINE;
            }
          // fall through
          case 45: break;
          case 4:
            { yybegin(YYINITIAL); return QmlTypes.NOT;
            }
          // fall through
          case 46: break;
          case 5:
            { yybegin(YYINITIAL); return QmlTypes.PERCENT;
            }
          // fall through
          case 47: break;
          case 6:
            { yybegin(YYINITIAL); return QmlTypes.AND;
            }
          // fall through
          case 48: break;
          case 7:
            { yybegin(YYINITIAL); return QmlTypes.LP;
            }
          // fall through
          case 49: break;
          case 8:
            { yybegin(YYINITIAL); return QmlTypes.RP;
            }
          // fall through
          case 50: break;
          case 9:
            { yybegin(YYINITIAL); return QmlTypes.MULT;
            }
          // fall through
          case 51: break;
          case 10:
            { yybegin(YYINITIAL); return QmlTypes.PLUS;
            }
          // fall through
          case 52: break;
          case 11:
            { yybegin(YYINITIAL); return QmlTypes.COMMA;
            }
          // fall through
          case 53: break;
          case 12:
            { yybegin(YYINITIAL); return QmlTypes.MINUS;
            }
          // fall through
          case 54: break;
          case 13:
            { yybegin(YYINITIAL); return QmlTypes.DOT;
            }
          // fall through
          case 55: break;
          case 14:
            { yybegin(YYINITIAL); return QmlTypes.DIV;
            }
          // fall through
          case 56: break;
          case 15:
            { yybegin(YYINITIAL); return QmlTypes.INT;
            }
          // fall through
          case 57: break;
          case 16:
            { yybegin(YYINITIAL); return QmlTypes.COLON;
            }
          // fall through
          case 58: break;
          case 17:
            { yybegin(YYINITIAL); return QmlTypes.SEMI;
            }
          // fall through
          case 59: break;
          case 18:
            { yybegin(YYINITIAL); return QmlTypes.LESS;
            }
          // fall through
          case 60: break;
          case 19:
            { yybegin(YYINITIAL); return QmlTypes.EQ;
            }
          // fall through
          case 61: break;
          case 20:
            { yybegin(YYINITIAL); return QmlTypes.GRATER;
            }
          // fall through
          case 62: break;
          case 21:
            { yybegin(YYINITIAL); return QmlTypes.Q_MARK;
            }
          // fall through
          case 63: break;
          case 22:
            { yybegin(YYINITIAL); return QmlTypes.IDENTIFIER;
            }
          // fall through
          case 64: break;
          case 23:
            { yybegin(YYINITIAL); return QmlTypes.L_BRACKET;
            }
          // fall through
          case 65: break;
          case 24:
            { yybegin(YYINITIAL); return QmlTypes.R_BRACKET;
            }
          // fall through
          case 66: break;
          case 25:
            { yybegin(YYINITIAL); return QmlTypes.LB;
            }
          // fall through
          case 67: break;
          case 26:
            { yybegin(YYINITIAL); return QmlTypes.OR;
            }
          // fall through
          case 68: break;
          case 27:
            { yybegin(YYINITIAL); return QmlTypes.RB;
            }
          // fall through
          case 69: break;
          case 28:
            { continue;
            }
          // fall through
          case 70: break;
          case 29:
            { yybegin(YYINITIAL); return QmlTypes.NOT_EQ;
            }
          // fall through
          case 71: break;
          case 30:
            { yybegin(YYINITIAL); return QmlTypes.STRING;
            }
          // fall through
          case 72: break;
          case 31:
            { yybegin(YYINITIAL); return QmlTypes.LAZY_AND;
            }
          // fall through
          case 73: break;
          case 32:
            { yybegin(BLOCK_OF_COMMENT); continue;
            }
          // fall through
          case 74: break;
          case 33:
            { yybegin(YYINITIAL); return QmlTypes.COMMENT;
            }
          // fall through
          case 75: break;
          case 34:
            { yybegin(YYINITIAL); return QmlTypes.FLOAT;
            }
          // fall through
          case 76: break;
          case 35:
            { yybegin(YYINITIAL); return QmlTypes.LESS_EQ;
            }
          // fall through
          case 77: break;
          case 36:
            { yybegin(YYINITIAL); return QmlTypes.D_EQ;
            }
          // fall through
          case 78: break;
          case 37:
            { yybegin(YYINITIAL); return QmlTypes.GRATER_EQ;
            }
          // fall through
          case 79: break;
          case 38:
            { yybegin(YYINITIAL); return QmlTypes.KEYWORD;
            }
          // fall through
          case 80: break;
          case 39:
            { yybegin(YYINITIAL); return QmlTypes.LAZY_OR;
            }
          // fall through
          case 81: break;
          case 40:
            { yybegin(YYINITIAL); return QmlTypes.D_NOT_EQ;
            }
          // fall through
          case 82: break;
          case 41:
            { yybegin(YYINITIAL); return QmlTypes.T_EQ;
            }
          // fall through
          case 83: break;
          case 42:
            { yybegin(YYINITIAL); return QmlTypes.BASE_TYPE;
            }
          // fall through
          case 84: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
