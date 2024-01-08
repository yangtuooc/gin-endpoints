// Generated from /Users/yangtuo/projects/open-source/gin-endpoints/src/main/kotlin/cn/yangtuooc/swag/SwagParser.g4 by ANTLR 4.13.1
package cn.yangtuooc.swag

import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.misc.*
import org.antlr.v4.kotlinruntime.tree.*

@Suppress("FunctionName", "LocalVariableName", "EnumEntryName", "ConvertSecondaryConstructorToPrimary", "ConstantConditionIf", "RemoveRedundantBackticks")
public open class SwagParser(input: TokenStream) : Parser(input) {
    private companion object {
        init {
            RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.runtimeVersion)
        }

        private const val SERIALIZED_ATN: String =
            "\u0004\u0001\u003f\u0100\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\u0008\u0007\u0008\u0002\u0009\u0007\u0009\u0002\u000a\u0007\u000a\u0002\u000b\u0007\u000b\u0002\u000c\u0007\u000c\u0002\u000d\u0007\u000d\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002\u0020\u0007\u0020\u0002\u0021\u0007\u0021\u0002\u0022\u0007\u0022\u0002\u0023\u0007\u0023\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0062\u0008\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0008\u0001\u0008\u0001\u0008\u0001\u0009\u0001\u0009\u0001\u000a\u0001\u000a\u0001\u000a\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000c\u0001\u000c\u0001\u000c\u0001\u000d\u0001\u000d\u0001\u000d\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0004\u0010\u0092\u0008\u0010\u000b\u0010\u000c\u0010\u0093\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0099\u0008\u0011\u000a\u0011\u000c\u0011\u009c\u0009\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00ab\u0008\u0014\u000a\u0014\u000c\u0014\u00ae\u0009\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u0020\u0001\u0020\u0001\u0020\u0001\u0020\u0005\u0020\u00d9\u0008\u0020\u000a\u0020\u000c\u0020\u00dc\u0009\u0020\u0001\u0020\u0001\u0020\u0001\u0020\u0001\u0020\u0003\u0020\u00e2\u0008\u0020\u0001\u0021\u0001\u0021\u0001\u0021\u0001\u0021\u0001\u0022\u0001\u0022\u0001\u0022\u0001\u0022\u0005\u0022\u00ec\u0008\u0022\u000a\u0022\u000c\u0022\u00ef\u0009\u0022\u0001\u0022\u0001\u0022\u0001\u0022\u0001\u0022\u0003\u0022\u00f5\u0008\u0022\u0001\u0023\u0001\u0023\u0001\u0023\u0001\u0023\u0001\u0023\u0001\u0023\u0001\u0023\u0003\u0023\u00fe\u0008\u0023\u0001\u0023\u0000\u0000\u0024\u0000\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0000\u0003\u0001\u0000\u003a\u003b\u0001\u0000\u0035\u0036\u0003\u0000\u0022\u0022\u0029\u0029\u002e\u0030\u0100\u0000\u0061\u0001\u0000\u0000\u0000\u0002\u0063\u0001\u0000\u0000\u0000\u0004\u0066\u0001\u0000\u0000\u0000\u0006\u0069\u0001\u0000\u0000\u0000\u0008\u006c\u0001\u0000\u0000\u0000\u000a\u006f\u0001\u0000\u0000\u0000\u000c\u0072\u0001\u0000\u0000\u0000\u000e\u0075\u0001\u0000\u0000\u0000\u0010\u0078\u0001\u0000\u0000\u0000\u0012\u007b\u0001\u0000\u0000\u0000\u0014\u007d\u0001\u0000\u0000\u0000\u0016\u0080\u0001\u0000\u0000\u0000\u0018\u0083\u0001\u0000\u0000\u0000\u001a\u0086\u0001\u0000\u0000\u0000\u001c\u0089\u0001\u0000\u0000\u0000\u001e\u008c\u0001\u0000\u0000\u0000\u0020\u008f\u0001\u0000\u0000\u0000\u0022\u0095\u0001\u0000\u0000\u0000\u0024\u009d\u0001\u0000\u0000\u0000\u0026\u00a0\u0001\u0000\u0000\u0000\u0028\u00a3\u0001\u0000\u0000\u0000\u002a\u00af\u0001\u0000\u0000\u0000\u002c\u00b1\u0001\u0000\u0000\u0000\u002e\u00b3\u0001\u0000\u0000\u0000\u0030\u00b8\u0001\u0000\u0000\u0000\u0032\u00bd\u0001\u0000\u0000\u0000\u0034\u00c2\u0001\u0000\u0000\u0000\u0036\u00c7\u0001\u0000\u0000\u0000\u0038\u00ca\u0001\u0000\u0000\u0000\u003a\u00cd\u0001\u0000\u0000\u0000\u003c\u00cf\u0001\u0000\u0000\u0000\u003e\u00d1\u0001\u0000\u0000\u0000\u0040\u00e1\u0001\u0000\u0000\u0000\u0042\u00e3\u0001\u0000\u0000\u0000\u0044\u00f4\u0001\u0000\u0000\u0000\u0046\u00fd\u0001\u0000\u0000\u0000\u0048\u0062\u0003\u0002\u0001\u0000\u0049\u0062\u0003\u0004\u0002\u0000\u004a\u0062\u0003\u0006\u0003\u0000\u004b\u0062\u0003\u0008\u0004\u0000\u004c\u0062\u0003\u000a\u0005\u0000\u004d\u0062\u0003\u000c\u0006\u0000\u004e\u0062\u0003\u000e\u0007\u0000\u004f\u0062\u0003\u0010\u0008\u0000\u0050\u0062\u0003\u0012\u0009\u0000\u0051\u0062\u0003\u0014\u000a\u0000\u0052\u0062\u0003\u0016\u000b\u0000\u0053\u0062\u0003\u0018\u000c\u0000\u0054\u0062\u0003\u001a\u000d\u0000\u0055\u0062\u0003\u001c\u000e\u0000\u0056\u0062\u0003\u001e\u000f\u0000\u0057\u0062\u0003\u0020\u0010\u0000\u0058\u0062\u0003\u0024\u0012\u0000\u0059\u0062\u0003\u0026\u0013\u0000\u005a\u0062\u0003\u0028\u0014\u0000\u005b\u0062\u0003\u002e\u0017\u0000\u005c\u0062\u0003\u0030\u0018\u0000\u005d\u0062\u0003\u0032\u0019\u0000\u005e\u0062\u0003\u0034\u001a\u0000\u005f\u0062\u0003\u0036\u001b\u0000\u0060\u0062\u0003\u0038\u001c\u0000\u0061\u0048\u0001\u0000\u0000\u0000\u0061\u0049\u0001\u0000\u0000\u0000\u0061\u004a\u0001\u0000\u0000\u0000\u0061\u004b\u0001\u0000\u0000\u0000\u0061\u004c\u0001\u0000\u0000\u0000\u0061\u004d\u0001\u0000\u0000\u0000\u0061\u004e\u0001\u0000\u0000\u0000\u0061\u004f\u0001\u0000\u0000\u0000\u0061\u0050\u0001\u0000\u0000\u0000\u0061\u0051\u0001\u0000\u0000\u0000\u0061\u0052\u0001\u0000\u0000\u0000\u0061\u0053\u0001\u0000\u0000\u0000\u0061\u0054\u0001\u0000\u0000\u0000\u0061\u0055\u0001\u0000\u0000\u0000\u0061\u0056\u0001\u0000\u0000\u0000\u0061\u0057\u0001\u0000\u0000\u0000\u0061\u0058\u0001\u0000\u0000\u0000\u0061\u0059\u0001\u0000\u0000\u0000\u0061\u005a\u0001\u0000\u0000\u0000\u0061\u005b\u0001\u0000\u0000\u0000\u0061\u005c\u0001\u0000\u0000\u0000\u0061\u005d\u0001\u0000\u0000\u0000\u0061\u005e\u0001\u0000\u0000\u0000\u0061\u005f\u0001\u0000\u0000\u0000\u0061\u0060\u0001\u0000\u0000\u0000\u0062\u0001\u0001\u0000\u0000\u0000\u0063\u0064\u0005\u0001\u0000\u0000\u0064\u0065\u0005\u0039\u0000\u0000\u0065\u0003\u0001\u0000\u0000\u0000\u0066\u0067\u0005\u0002\u0000\u0000\u0067\u0068\u0005\u0039\u0000\u0000\u0068\u0005\u0001\u0000\u0000\u0000\u0069\u006a\u0005\u0003\u0000\u0000\u006a\u006b\u0005\u0039\u0000\u0000\u006b\u0007\u0001\u0000\u0000\u0000\u006c\u006d\u0005\u0007\u0000\u0000\u006d\u006e\u0005\u0039\u0000\u0000\u006e\u0009\u0001\u0000\u0000\u0000\u006f\u0070\u0005\u0008\u0000\u0000\u0070\u0071\u0005\u0039\u0000\u0000\u0071\u000b\u0001\u0000\u0000\u0000\u0072\u0073\u0005\u0009\u0000\u0000\u0073\u0074\u0005\u0039\u0000\u0000\u0074\u000d\u0001\u0000\u0000\u0000\u0075\u0076\u0005\u000a\u0000\u0000\u0076\u0077\u0005\u003c\u0000\u0000\u0077\u000f\u0001\u0000\u0000\u0000\u0078\u0079\u0005\u000b\u0000\u0000\u0079\u007a\u0005\u0039\u0000\u0000\u007a\u0011\u0001\u0000\u0000\u0000\u007b\u007c\u0007\u0000\u0000\u0000\u007c\u0013\u0001\u0000\u0000\u0000\u007d\u007e\u0005\u000d\u0000\u0000\u007e\u007f\u0005\u0039\u0000\u0000\u007f\u0015\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u000e\u0000\u0000\u0081\u0082\u0005\u0039\u0000\u0000\u0082\u0017\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u000f\u0000\u0000\u0084\u0085\u0005\u0039\u0000\u0000\u0085\u0019\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0010\u0000\u0000\u0087\u0088\u0005\u0039\u0000\u0000\u0088\u001b\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0011\u0000\u0000\u008a\u008b\u0005\u0039\u0000\u0000\u008b\u001d\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0017\u0000\u0000\u008d\u008e\u0005\u0039\u0000\u0000\u008e\u001f\u0001\u0000\u0000\u0000\u008f\u0091\u0005\u0016\u0000\u0000\u0090\u0092\u0003\u0022\u0011\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0021\u0001\u0000\u0000\u0000\u0095\u009a\u0005\u0039\u0000\u0000\u0096\u0097\u0005\u0037\u0000\u0000\u0097\u0099\u0005\u0039\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0023\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0018\u0000\u0000\u009e\u009f\u0005\u0021\u0000\u0000\u009f\u0025\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0019\u0000\u0000\u00a1\u00a2\u0005\u0021\u0000\u0000\u00a2\u0027\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u001a\u0000\u0000\u00a4\u00a5\u0005\u0022\u0000\u0000\u00a5\u00a6\u0005\u0023\u0000\u0000\u00a6\u00a7\u0005\u0024\u0000\u0000\u00a7\u00a8\u0003\u002c\u0016\u0000\u00a8\u00ac\u0003\u002a\u0015\u0000\u00a9\u00ab\u0005\u0026\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u0029\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0039\u0000\u0000\u00b0\u002b\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007\u0001\u0000\u0000\u00b2\u002d\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003\u003a\u001d\u0000\u00b4\u00b5\u0005\u0023\u0000\u0000\u00b5\u00b6\u0005\u0024\u0000\u0000\u00b6\u00b7\u0003\u002a\u0015\u0000\u00b7\u002f\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003\u003a\u001d\u0000\u00b9\u00ba\u0005\u0023\u0000\u0000\u00ba\u00bb\u0005\u0024\u0000\u0000\u00bb\u00bc\u0003\u002a\u0015\u0000\u00bc\u0031\u0001\u0000\u0000\u0000\u00bd\u00be\u0003\u003a\u001d\u0000\u00be\u00bf\u0005\u0023\u0000\u0000\u00bf\u00c0\u0005\u0024\u0000\u0000\u00c0\u00c1\u0003\u002a\u0015\u0000\u00c1\u0033\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003\u003a\u001d\u0000\u00c3\u00c4\u0005\u0023\u0000\u0000\u00c4\u00c5\u0005\u0024\u0000\u0000\u00c5\u00c6\u0003\u002a\u0015\u0000\u00c6\u0035\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003\u003c\u001e\u0000\u00c8\u00c9\u0005\u0027\u0000\u0000\u00c9\u0037\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0028\u0000\u0000\u00cb\u00cc\u0003\u003e\u001f\u0000\u00cc\u0039\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u002b\u0000\u0000\u00ce\u003b\u0001\u0000\u0000\u0000\u00cf\u00d0\u0007\u0002\u0000\u0000\u00d0\u003d\u0001\u0000\u0000\u0000\u00d1\u00d2\u0003\u0046\u0023\u0000\u00d2\u00d3\u0005\u0000\u0000\u0001\u00d3\u003f\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u002e\u0000\u0000\u00d5\u00da\u0003\u0042\u0021\u0000\u00d6\u00d7\u0005\u0037\u0000\u0000\u00d7\u00d9\u0003\u0042\u0021\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u002f\u0000\u0000\u00de\u00e2\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u002e\u0000\u0000\u00e0\u00e2\u0005\u002f\u0000\u0000\u00e1\u00d4\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u0041\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u003e\u0000\u0000\u00e4\u00e5\u0005\u0031\u0000\u0000\u00e5\u00e6\u0003\u0046\u0023\u0000\u00e6\u0043\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0032\u0000\u0000\u00e8\u00ed\u0003\u0046\u0023\u0000\u00e9\u00ea\u0005\u0037\u0000\u0000\u00ea\u00ec\u0003\u0046\u0023\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0033\u0000\u0000\u00f1\u00f5\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0032\u0000\u0000\u00f3\u00f5\u0005\u0033\u0000\u0000\u00f4\u00e7\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u0045\u0001\u0000\u0000\u0000\u00f6\u00fe\u0005\u003e\u0000\u0000\u00f7\u00fe\u0005\u003f\u0000\u0000\u00f8\u00fe\u0003\u0040\u0020\u0000\u00f9\u00fe\u0003\u0044\u0022\u0000\u00fa\u00fe\u0005\u0035\u0000\u0000\u00fb\u00fe\u0005\u0036\u0000\u0000\u00fc\u00fe\u0005\u0034\u0000\u0000\u00fd\u00f6\u0001\u0000\u0000\u0000\u00fd\u00f7\u0001\u0000\u0000\u0000\u00fd\u00f8\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u0047\u0001\u0000\u0000\u0000\u0009\u0061\u0093\u009a\u00ac\u00da\u00e1\u00ed\u00f4\u00fd"

        private val ATN = ATNDeserializer().deserialize(SERIALIZED_ATN.toCharArray())

        private val DECISION_TO_DFA = Array(ATN.numberOfDecisions) {
            DFA(ATN.getDecisionState(it)!!, it)
        }

        private val SHARED_CONTEXT_CACHE = PredictionContextCache()
        private val RULE_NAMES: Array<String> =
            arrayOf("statement", "title", "version", "description", "termsOfService", 
                    "contactName", "contactUrl", "contactEmail", "licenseName", 
                    "licenseUrl", "host", "basePath", "securityDefinitionsBasic", 
                    "externalDocsDescription", "externalDocsUrl", "summary", 
                    "tags", "tag", "accept", "produce", "param", "comment", 
                    "isMandatory", "success", "failure", "response", "header", 
                    "router", "extensions", "returnCode", "path", "json", 
                    "obj", "pair", "arr", "value")

        private val LITERAL_NAMES: Array<String?> =
            arrayOf(null, "'@title'", "'@version'", "'@description'", "'@tag.name'", 
                    "'@tag.description'", "'@tag.docs.url'", "'@termsOfService'", 
                    "'@contact.name'", "'@contact.url'", "'@contact.email'", 
                    "'@license.name'", "'@license.url'", "'@host'", "'@BasePath'", 
                    "'@securityDefinitions.basic'", "'@externalDocs.description'", 
                    "'@externalDocs.url'", "'@query.collection.format'", 
                    "'@schema'", "'@description.markdown'", "'@Id'", "'@Tags'", 
                    "'@Summary'", "'@Accept'", "'@Produce'", "'@Param'", 
                    "'@Security'", "'@Success'", "'@Failure'", "'@Response'", 
                    "'@Header'", "'@Router'", null, null, null, null, null, 
                    null, null, "'x-'", "'/'", null, null, "'('", "')'", 
                    "'{'", "'}'", "'*'", "':'", "'['", "']'", "'null'", 
                    "'true'", "'false'", "','")

        private val SYMBOLIC_NAMES: Array<String?> =
            arrayOf(null, "TITLE", "VERSION", "DESCRIPTION", "TAG_NAME", 
                    "TAG_DESCRIPTION", "TAG_DOCS_URL", "TERMS_OF_SERVICE", 
                    "CONTACT_NAME", "CONTACT_URL", "CONTACT_EMAIL", "LICENSE_NAME", 
                    "LICENSE_URL", "HOST", "BASE_PATH", "SECURITY_DEFINITIONS_BASIC", 
                    "EXTERNAL_DOCS_DESCRIPTION", "EXTERNAL_DOCS_URL", "QUERY_COLLECTION_FORMAT", 
                    "SCHEMA", "DESCRIPTION_MARKDOWN", "ID", "TAGS", "SUMMARY", 
                    "ACCEPT", "PRODUCE", "PARAM", "SECURITY", "SUCCESS", 
                    "FAILURE", "RESPONSE", "HEADER", "ROUTER", "MIME", "IDENTIFIER", 
                    "PARAM_TYPE", "DATA_TYPE", "COLLECTION_FORMAT", "ATTRIBUTES", 
                    "HTTP_METHODS", "EXTENSION_MARK", "SLASH", "FLOAT", 
                    "INTEGER", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", 
                    "RIGHT_BRACE", "STAR", "COLON", "LEFT_BRACKET", "RIGHT_BRACKET", 
                    "NULL", "TRUE", "FALSE", "COMMA", "SPACE", "TEXT", "HTTP_URL", 
                    "HTTPS_URL", "EMAIL", "WS", "STRING", "NUMBER")

        private val VOCABULARY = VocabularyImpl(LITERAL_NAMES, SYMBOLIC_NAMES)

        private val TOKEN_NAMES: Array<String> = Array(SYMBOLIC_NAMES.size) {
            VOCABULARY.getLiteralName(it)
                ?: VOCABULARY.getSymbolicName(it)
                ?: "<INVALID>"
        }
    }

    public enum class Tokens(public val id: kotlin.Int) {
        EOF(-1),
        `TITLE`(1),
        `VERSION`(2),
        `DESCRIPTION`(3),
        `TAG_NAME`(4),
        `TAG_DESCRIPTION`(5),
        `TAG_DOCS_URL`(6),
        `TERMS_OF_SERVICE`(7),
        `CONTACT_NAME`(8),
        `CONTACT_URL`(9),
        `CONTACT_EMAIL`(10),
        `LICENSE_NAME`(11),
        `LICENSE_URL`(12),
        `HOST`(13),
        `BASE_PATH`(14),
        `SECURITY_DEFINITIONS_BASIC`(15),
        `EXTERNAL_DOCS_DESCRIPTION`(16),
        `EXTERNAL_DOCS_URL`(17),
        `QUERY_COLLECTION_FORMAT`(18),
        `SCHEMA`(19),
        `DESCRIPTION_MARKDOWN`(20),
        `ID`(21),
        `TAGS`(22),
        `SUMMARY`(23),
        `ACCEPT`(24),
        `PRODUCE`(25),
        `PARAM`(26),
        `SECURITY`(27),
        `SUCCESS`(28),
        `FAILURE`(29),
        `RESPONSE`(30),
        `HEADER`(31),
        `ROUTER`(32),
        `MIME`(33),
        `IDENTIFIER`(34),
        `PARAM_TYPE`(35),
        `DATA_TYPE`(36),
        `COLLECTION_FORMAT`(37),
        `ATTRIBUTES`(38),
        `HTTP_METHODS`(39),
        `EXTENSION_MARK`(40),
        `SLASH`(41),
        `FLOAT`(42),
        `INTEGER`(43),
        `LEFT_PAREN`(44),
        `RIGHT_PAREN`(45),
        `LEFT_BRACE`(46),
        `RIGHT_BRACE`(47),
        `STAR`(48),
        `COLON`(49),
        `LEFT_BRACKET`(50),
        `RIGHT_BRACKET`(51),
        `NULL`(52),
        `TRUE`(53),
        `FALSE`(54),
        `COMMA`(55),
        `SPACE`(56),
        `TEXT`(57),
        `HTTP_URL`(58),
        `HTTPS_URL`(59),
        `EMAIL`(60),
        `WS`(61),
        `STRING`(62),
        `NUMBER`(63)
    }

    public enum class Rules(public val id: kotlin.Int) {
        `statement`(0),
        `title`(1),
        `version`(2),
        `description`(3),
        `termsOfService`(4),
        `contactName`(5),
        `contactUrl`(6),
        `contactEmail`(7),
        `licenseName`(8),
        `licenseUrl`(9),
        `host`(10),
        `basePath`(11),
        `securityDefinitionsBasic`(12),
        `externalDocsDescription`(13),
        `externalDocsUrl`(14),
        `summary`(15),
        `tags`(16),
        `tag`(17),
        `accept`(18),
        `produce`(19),
        `param`(20),
        `comment`(21),
        `isMandatory`(22),
        `success`(23),
        `failure`(24),
        `response`(25),
        `header`(26),
        `router`(27),
        `extensions`(28),
        `returnCode`(29),
        `path`(30),
        `json`(31),
        `obj`(32),
        `pair`(33),
        `arr`(34),
        `value`(35)
    }

    override var interpreter: ParserATNSimulator =
        @Suppress("LeakingThis")
        ParserATNSimulator(this, ATN, DECISION_TO_DFA, SHARED_CONTEXT_CACHE)

    override val grammarFileName: String =
        "SwagParser.g4"

    @Deprecated("Use vocabulary instead", replaceWith = ReplaceWith("vocabulary"))
    override val tokenNames: Array<String> =
        TOKEN_NAMES

    override val ruleNames: Array<String> =
        RULE_NAMES

    override val atn: ATN =
        ATN

    override val vocabulary: Vocabulary =
        VOCABULARY

    override val serializedATN: String =
        SERIALIZED_ATN

    private val TITLE = Tokens.TITLE.id
    private val VERSION = Tokens.VERSION.id
    private val DESCRIPTION = Tokens.DESCRIPTION.id
    private val TAG_NAME = Tokens.TAG_NAME.id
    private val TAG_DESCRIPTION = Tokens.TAG_DESCRIPTION.id
    private val TAG_DOCS_URL = Tokens.TAG_DOCS_URL.id
    private val TERMS_OF_SERVICE = Tokens.TERMS_OF_SERVICE.id
    private val CONTACT_NAME = Tokens.CONTACT_NAME.id
    private val CONTACT_URL = Tokens.CONTACT_URL.id
    private val CONTACT_EMAIL = Tokens.CONTACT_EMAIL.id
    private val LICENSE_NAME = Tokens.LICENSE_NAME.id
    private val LICENSE_URL = Tokens.LICENSE_URL.id
    private val HOST = Tokens.HOST.id
    private val BASE_PATH = Tokens.BASE_PATH.id
    private val SECURITY_DEFINITIONS_BASIC = Tokens.SECURITY_DEFINITIONS_BASIC.id
    private val EXTERNAL_DOCS_DESCRIPTION = Tokens.EXTERNAL_DOCS_DESCRIPTION.id
    private val EXTERNAL_DOCS_URL = Tokens.EXTERNAL_DOCS_URL.id
    private val QUERY_COLLECTION_FORMAT = Tokens.QUERY_COLLECTION_FORMAT.id
    private val SCHEMA = Tokens.SCHEMA.id
    private val DESCRIPTION_MARKDOWN = Tokens.DESCRIPTION_MARKDOWN.id
    private val ID = Tokens.ID.id
    private val TAGS = Tokens.TAGS.id
    private val SUMMARY = Tokens.SUMMARY.id
    private val ACCEPT = Tokens.ACCEPT.id
    private val PRODUCE = Tokens.PRODUCE.id
    private val PARAM = Tokens.PARAM.id
    private val SECURITY = Tokens.SECURITY.id
    private val SUCCESS = Tokens.SUCCESS.id
    private val FAILURE = Tokens.FAILURE.id
    private val RESPONSE = Tokens.RESPONSE.id
    private val HEADER = Tokens.HEADER.id
    private val ROUTER = Tokens.ROUTER.id
    private val MIME = Tokens.MIME.id
    private val IDENTIFIER = Tokens.IDENTIFIER.id
    private val PARAM_TYPE = Tokens.PARAM_TYPE.id
    private val DATA_TYPE = Tokens.DATA_TYPE.id
    private val COLLECTION_FORMAT = Tokens.COLLECTION_FORMAT.id
    private val ATTRIBUTES = Tokens.ATTRIBUTES.id
    private val HTTP_METHODS = Tokens.HTTP_METHODS.id
    private val EXTENSION_MARK = Tokens.EXTENSION_MARK.id
    private val SLASH = Tokens.SLASH.id
    private val FLOAT = Tokens.FLOAT.id
    private val INTEGER = Tokens.INTEGER.id
    private val LEFT_PAREN = Tokens.LEFT_PAREN.id
    private val RIGHT_PAREN = Tokens.RIGHT_PAREN.id
    private val LEFT_BRACE = Tokens.LEFT_BRACE.id
    private val RIGHT_BRACE = Tokens.RIGHT_BRACE.id
    private val STAR = Tokens.STAR.id
    private val COLON = Tokens.COLON.id
    private val LEFT_BRACKET = Tokens.LEFT_BRACKET.id
    private val RIGHT_BRACKET = Tokens.RIGHT_BRACKET.id
    private val NULL = Tokens.NULL.id
    private val TRUE = Tokens.TRUE.id
    private val FALSE = Tokens.FALSE.id
    private val COMMA = Tokens.COMMA.id
    private val SPACE = Tokens.SPACE.id
    private val TEXT = Tokens.TEXT.id
    private val HTTP_URL = Tokens.HTTP_URL.id
    private val HTTPS_URL = Tokens.HTTPS_URL.id
    private val EMAIL = Tokens.EMAIL.id
    private val WS = Tokens.WS.id
    private val STRING = Tokens.STRING.id
    private val NUMBER = Tokens.NUMBER.id

    /* Named actions */

    /* Funcs */
    @Suppress("FunctionName")
    public open class StatementContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.statement.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun findTitle(): TitleContext? = getRuleContext(TitleContext::class, 0)
        public fun findVersion(): VersionContext? = getRuleContext(VersionContext::class, 0)
        public fun findDescription(): DescriptionContext? = getRuleContext(DescriptionContext::class, 0)
        public fun findTermsOfService(): TermsOfServiceContext? = getRuleContext(TermsOfServiceContext::class, 0)
        public fun findContactName(): ContactNameContext? = getRuleContext(ContactNameContext::class, 0)
        public fun findContactUrl(): ContactUrlContext? = getRuleContext(ContactUrlContext::class, 0)
        public fun findContactEmail(): ContactEmailContext? = getRuleContext(ContactEmailContext::class, 0)
        public fun findLicenseName(): LicenseNameContext? = getRuleContext(LicenseNameContext::class, 0)
        public fun findLicenseUrl(): LicenseUrlContext? = getRuleContext(LicenseUrlContext::class, 0)
        public fun findHost(): HostContext? = getRuleContext(HostContext::class, 0)
        public fun findBasePath(): BasePathContext? = getRuleContext(BasePathContext::class, 0)
        public fun findSecurityDefinitionsBasic(): SecurityDefinitionsBasicContext? = getRuleContext(SecurityDefinitionsBasicContext::class, 0)
        public fun findExternalDocsDescription(): ExternalDocsDescriptionContext? = getRuleContext(ExternalDocsDescriptionContext::class, 0)
        public fun findExternalDocsUrl(): ExternalDocsUrlContext? = getRuleContext(ExternalDocsUrlContext::class, 0)
        public fun findSummary(): SummaryContext? = getRuleContext(SummaryContext::class, 0)
        public fun findTags(): TagsContext? = getRuleContext(TagsContext::class, 0)
        public fun findAccept(): AcceptContext? = getRuleContext(AcceptContext::class, 0)
        public fun findProduce(): ProduceContext? = getRuleContext(ProduceContext::class, 0)
        public fun findParam(): ParamContext? = getRuleContext(ParamContext::class, 0)
        public fun findSuccess(): SuccessContext? = getRuleContext(SuccessContext::class, 0)
        public fun findFailure(): FailureContext? = getRuleContext(FailureContext::class, 0)
        public fun findResponse(): ResponseContext? = getRuleContext(ResponseContext::class, 0)
        public fun findHeader(): HeaderContext? = getRuleContext(HeaderContext::class, 0)
        public fun findRouter(): RouterContext? = getRuleContext(RouterContext::class, 0)
        public fun findExtensions(): ExtensionsContext? = getRuleContext(ExtensionsContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterStatement(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitStatement(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitStatement(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun statement(): StatementContext {
        var _localctx = StatementContext(context, state)
        enterRule(_localctx, 0, Rules.statement.id)

        try {
            this.state = 97
            errorHandler.sync(this)

            when (interpreter.adaptivePredict(_input, 0, context)) {
                1 -> {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 72
                        title()
                    }
                }2 -> {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 73
                        version()
                    }
                }3 -> {
                    enterOuterAlt(_localctx, 3)
                    if (true) {
                        this.state = 74
                        description()
                    }
                }4 -> {
                    enterOuterAlt(_localctx, 4)
                    if (true) {
                        this.state = 75
                        termsOfService()
                    }
                }5 -> {
                    enterOuterAlt(_localctx, 5)
                    if (true) {
                        this.state = 76
                        contactName()
                    }
                }6 -> {
                    enterOuterAlt(_localctx, 6)
                    if (true) {
                        this.state = 77
                        contactUrl()
                    }
                }7 -> {
                    enterOuterAlt(_localctx, 7)
                    if (true) {
                        this.state = 78
                        contactEmail()
                    }
                }8 -> {
                    enterOuterAlt(_localctx, 8)
                    if (true) {
                        this.state = 79
                        licenseName()
                    }
                }9 -> {
                    enterOuterAlt(_localctx, 9)
                    if (true) {
                        this.state = 80
                        licenseUrl()
                    }
                }10 -> {
                    enterOuterAlt(_localctx, 10)
                    if (true) {
                        this.state = 81
                        host()
                    }
                }11 -> {
                    enterOuterAlt(_localctx, 11)
                    if (true) {
                        this.state = 82
                        basePath()
                    }
                }12 -> {
                    enterOuterAlt(_localctx, 12)
                    if (true) {
                        this.state = 83
                        securityDefinitionsBasic()
                    }
                }13 -> {
                    enterOuterAlt(_localctx, 13)
                    if (true) {
                        this.state = 84
                        externalDocsDescription()
                    }
                }14 -> {
                    enterOuterAlt(_localctx, 14)
                    if (true) {
                        this.state = 85
                        externalDocsUrl()
                    }
                }15 -> {
                    enterOuterAlt(_localctx, 15)
                    if (true) {
                        this.state = 86
                        summary()
                    }
                }16 -> {
                    enterOuterAlt(_localctx, 16)
                    if (true) {
                        this.state = 87
                        tags()
                    }
                }17 -> {
                    enterOuterAlt(_localctx, 17)
                    if (true) {
                        this.state = 88
                        accept()
                    }
                }18 -> {
                    enterOuterAlt(_localctx, 18)
                    if (true) {
                        this.state = 89
                        produce()
                    }
                }19 -> {
                    enterOuterAlt(_localctx, 19)
                    if (true) {
                        this.state = 90
                        param()
                    }
                }20 -> {
                    enterOuterAlt(_localctx, 20)
                    if (true) {
                        this.state = 91
                        success()
                    }
                }21 -> {
                    enterOuterAlt(_localctx, 21)
                    if (true) {
                        this.state = 92
                        failure()
                    }
                }22 -> {
                    enterOuterAlt(_localctx, 22)
                    if (true) {
                        this.state = 93
                        response()
                    }
                }23 -> {
                    enterOuterAlt(_localctx, 23)
                    if (true) {
                        this.state = 94
                        header()
                    }
                }24 -> {
                    enterOuterAlt(_localctx, 24)
                    if (true) {
                        this.state = 95
                        router()
                    }
                }25 -> {
                    enterOuterAlt(_localctx, 25)
                    if (true) {
                        this.state = 96
                        extensions()
                    }
                }
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class TitleContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.title.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun TITLE(): TerminalNode? = getToken(Tokens.TITLE.id, 0)
        public fun TEXT(): TerminalNode? = getToken(Tokens.TEXT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterTitle(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitTitle(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitTitle(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun title(): TitleContext {
        var _localctx = TitleContext(context, state)
        enterRule(_localctx, 2, Rules.title.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 99
                match(TITLE)
                this.state = 100
                match(TEXT)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class VersionContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.version.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun VERSION(): TerminalNode? = getToken(Tokens.VERSION.id, 0)
        public fun TEXT(): TerminalNode? = getToken(Tokens.TEXT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterVersion(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitVersion(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitVersion(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun version(): VersionContext {
        var _localctx = VersionContext(context, state)
        enterRule(_localctx, 4, Rules.version.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 102
                match(VERSION)
                this.state = 103
                match(TEXT)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class DescriptionContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.description.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun DESCRIPTION(): TerminalNode? = getToken(Tokens.DESCRIPTION.id, 0)
        public fun TEXT(): TerminalNode? = getToken(Tokens.TEXT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterDescription(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitDescription(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitDescription(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun description(): DescriptionContext {
        var _localctx = DescriptionContext(context, state)
        enterRule(_localctx, 6, Rules.description.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 105
                match(DESCRIPTION)
                this.state = 106
                match(TEXT)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class TermsOfServiceContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.termsOfService.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun TERMS_OF_SERVICE(): TerminalNode? = getToken(Tokens.TERMS_OF_SERVICE.id, 0)
        public fun TEXT(): TerminalNode? = getToken(Tokens.TEXT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterTermsOfService(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitTermsOfService(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitTermsOfService(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun termsOfService(): TermsOfServiceContext {
        var _localctx = TermsOfServiceContext(context, state)
        enterRule(_localctx, 8, Rules.termsOfService.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 108
                match(TERMS_OF_SERVICE)
                this.state = 109
                match(TEXT)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class ContactNameContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.contactName.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun CONTACT_NAME(): TerminalNode? = getToken(Tokens.CONTACT_NAME.id, 0)
        public fun TEXT(): TerminalNode? = getToken(Tokens.TEXT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterContactName(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitContactName(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitContactName(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun contactName(): ContactNameContext {
        var _localctx = ContactNameContext(context, state)
        enterRule(_localctx, 10, Rules.contactName.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 111
                match(CONTACT_NAME)
                this.state = 112
                match(TEXT)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class ContactUrlContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.contactUrl.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun CONTACT_URL(): TerminalNode? = getToken(Tokens.CONTACT_URL.id, 0)
        public fun TEXT(): TerminalNode? = getToken(Tokens.TEXT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterContactUrl(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitContactUrl(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitContactUrl(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun contactUrl(): ContactUrlContext {
        var _localctx = ContactUrlContext(context, state)
        enterRule(_localctx, 12, Rules.contactUrl.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 114
                match(CONTACT_URL)
                this.state = 115
                match(TEXT)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class ContactEmailContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.contactEmail.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun CONTACT_EMAIL(): TerminalNode? = getToken(Tokens.CONTACT_EMAIL.id, 0)
        public fun EMAIL(): TerminalNode? = getToken(Tokens.EMAIL.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterContactEmail(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitContactEmail(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitContactEmail(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun contactEmail(): ContactEmailContext {
        var _localctx = ContactEmailContext(context, state)
        enterRule(_localctx, 14, Rules.contactEmail.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 117
                match(CONTACT_EMAIL)
                this.state = 118
                match(EMAIL)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class LicenseNameContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.licenseName.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun LICENSE_NAME(): TerminalNode? = getToken(Tokens.LICENSE_NAME.id, 0)
        public fun TEXT(): TerminalNode? = getToken(Tokens.TEXT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterLicenseName(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitLicenseName(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitLicenseName(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun licenseName(): LicenseNameContext {
        var _localctx = LicenseNameContext(context, state)
        enterRule(_localctx, 16, Rules.licenseName.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 120
                match(LICENSE_NAME)
                this.state = 121
                match(TEXT)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class LicenseUrlContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.licenseUrl.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun HTTP_URL(): TerminalNode? = getToken(Tokens.HTTP_URL.id, 0)
        public fun HTTPS_URL(): TerminalNode? = getToken(Tokens.HTTPS_URL.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterLicenseUrl(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitLicenseUrl(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitLicenseUrl(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun licenseUrl(): LicenseUrlContext {
        var _localctx = LicenseUrlContext(context, state)
        enterRule(_localctx, 18, Rules.licenseUrl.id)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 123
                _la = _input.LA(1)

                if (!(_la == HTTP_URL || _la == HTTPS_URL)) {
                    errorHandler.recoverInline(this)
                }
                else {
                    if (_input.LA(1) == Tokens.EOF.id) {
                        isMatchedEOF = true
                    }

                    errorHandler.reportMatch(this)
                    consume()
                }
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class HostContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.host.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun HOST(): TerminalNode? = getToken(Tokens.HOST.id, 0)
        public fun TEXT(): TerminalNode? = getToken(Tokens.TEXT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterHost(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitHost(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitHost(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun host(): HostContext {
        var _localctx = HostContext(context, state)
        enterRule(_localctx, 20, Rules.host.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 125
                match(HOST)
                this.state = 126
                match(TEXT)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class BasePathContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.basePath.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun BASE_PATH(): TerminalNode? = getToken(Tokens.BASE_PATH.id, 0)
        public fun TEXT(): TerminalNode? = getToken(Tokens.TEXT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterBasePath(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitBasePath(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitBasePath(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun basePath(): BasePathContext {
        var _localctx = BasePathContext(context, state)
        enterRule(_localctx, 22, Rules.basePath.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 128
                match(BASE_PATH)
                this.state = 129
                match(TEXT)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class SecurityDefinitionsBasicContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.securityDefinitionsBasic.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun SECURITY_DEFINITIONS_BASIC(): TerminalNode? = getToken(Tokens.SECURITY_DEFINITIONS_BASIC.id, 0)
        public fun TEXT(): TerminalNode? = getToken(Tokens.TEXT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterSecurityDefinitionsBasic(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitSecurityDefinitionsBasic(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitSecurityDefinitionsBasic(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun securityDefinitionsBasic(): SecurityDefinitionsBasicContext {
        var _localctx = SecurityDefinitionsBasicContext(context, state)
        enterRule(_localctx, 24, Rules.securityDefinitionsBasic.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 131
                match(SECURITY_DEFINITIONS_BASIC)
                this.state = 132
                match(TEXT)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class ExternalDocsDescriptionContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.externalDocsDescription.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun EXTERNAL_DOCS_DESCRIPTION(): TerminalNode? = getToken(Tokens.EXTERNAL_DOCS_DESCRIPTION.id, 0)
        public fun TEXT(): TerminalNode? = getToken(Tokens.TEXT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterExternalDocsDescription(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitExternalDocsDescription(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitExternalDocsDescription(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun externalDocsDescription(): ExternalDocsDescriptionContext {
        var _localctx = ExternalDocsDescriptionContext(context, state)
        enterRule(_localctx, 26, Rules.externalDocsDescription.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 134
                match(EXTERNAL_DOCS_DESCRIPTION)
                this.state = 135
                match(TEXT)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class ExternalDocsUrlContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.externalDocsUrl.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun EXTERNAL_DOCS_URL(): TerminalNode? = getToken(Tokens.EXTERNAL_DOCS_URL.id, 0)
        public fun TEXT(): TerminalNode? = getToken(Tokens.TEXT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterExternalDocsUrl(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitExternalDocsUrl(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitExternalDocsUrl(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun externalDocsUrl(): ExternalDocsUrlContext {
        var _localctx = ExternalDocsUrlContext(context, state)
        enterRule(_localctx, 28, Rules.externalDocsUrl.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 137
                match(EXTERNAL_DOCS_URL)
                this.state = 138
                match(TEXT)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class SummaryContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.summary.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun SUMMARY(): TerminalNode? = getToken(Tokens.SUMMARY.id, 0)
        public fun TEXT(): TerminalNode? = getToken(Tokens.TEXT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterSummary(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitSummary(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitSummary(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun summary(): SummaryContext {
        var _localctx = SummaryContext(context, state)
        enterRule(_localctx, 30, Rules.summary.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 140
                match(SUMMARY)
                this.state = 141
                match(TEXT)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class TagsContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.tags.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun TAGS(): TerminalNode? = getToken(Tokens.TAGS.id, 0)
        public fun findTag(): List<TagContext> = getRuleContexts(TagContext::class)
        public fun findTag(i: Int): TagContext? = getRuleContext(TagContext::class, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterTags(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitTags(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitTags(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun tags(): TagsContext {
        var _localctx = TagsContext(context, state)
        enterRule(_localctx, 32, Rules.tags.id)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 143
                match(TAGS)
                this.state = 145 
                errorHandler.sync(this)
                _la = _input.LA(1)

                do {
                    if (true) {
                        if (true) {
                            this.state = 144
                            tag()
                        }
                    }
                    this.state = 147 
                    errorHandler.sync(this)
                    _la = _input.LA(1)
                } while (_la == TEXT)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class TagContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.tag.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun TEXT(): List<TerminalNode> = getTokens(Tokens.TEXT.id)
        public fun TEXT(i: Int): TerminalNode = getToken(Tokens.TEXT.id, i)!!
        public fun COMMA(): List<TerminalNode> = getTokens(Tokens.COMMA.id)
        public fun COMMA(i: Int): TerminalNode = getToken(Tokens.COMMA.id, i)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterTag(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitTag(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitTag(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun tag(): TagContext {
        var _localctx = TagContext(context, state)
        enterRule(_localctx, 34, Rules.tag.id)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 149
                match(TEXT)
                this.state = 154
                errorHandler.sync(this)
                _la = _input.LA(1)

                while (_la == COMMA) {
                    if (true) {
                        if (true) {
                            this.state = 150
                            match(COMMA)
                            this.state = 151
                            match(TEXT)
                        }
                    }
                    this.state = 156
                    errorHandler.sync(this)
                    _la = _input.LA(1)
                }
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class AcceptContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.accept.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun ACCEPT(): TerminalNode? = getToken(Tokens.ACCEPT.id, 0)
        public fun MIME(): TerminalNode? = getToken(Tokens.MIME.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterAccept(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitAccept(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitAccept(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun accept(): AcceptContext {
        var _localctx = AcceptContext(context, state)
        enterRule(_localctx, 36, Rules.accept.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 157
                match(ACCEPT)
                this.state = 158
                match(MIME)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class ProduceContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.produce.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun PRODUCE(): TerminalNode? = getToken(Tokens.PRODUCE.id, 0)
        public fun MIME(): TerminalNode? = getToken(Tokens.MIME.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterProduce(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitProduce(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitProduce(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun produce(): ProduceContext {
        var _localctx = ProduceContext(context, state)
        enterRule(_localctx, 38, Rules.produce.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 160
                match(PRODUCE)
                this.state = 161
                match(MIME)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class ParamContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.param.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun PARAM(): TerminalNode? = getToken(Tokens.PARAM.id, 0)
        public fun IDENTIFIER(): TerminalNode? = getToken(Tokens.IDENTIFIER.id, 0)
        public fun PARAM_TYPE(): TerminalNode? = getToken(Tokens.PARAM_TYPE.id, 0)
        public fun DATA_TYPE(): TerminalNode? = getToken(Tokens.DATA_TYPE.id, 0)
        public fun findIsMandatory(): IsMandatoryContext? = getRuleContext(IsMandatoryContext::class, 0)
        public fun findComment(): CommentContext? = getRuleContext(CommentContext::class, 0)
        public fun ATTRIBUTES(): List<TerminalNode> = getTokens(Tokens.ATTRIBUTES.id)
        public fun ATTRIBUTES(i: Int): TerminalNode = getToken(Tokens.ATTRIBUTES.id, i)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterParam(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitParam(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitParam(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun param(): ParamContext {
        var _localctx = ParamContext(context, state)
        enterRule(_localctx, 40, Rules.param.id)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 163
                match(PARAM)
                this.state = 164
                match(IDENTIFIER)
                this.state = 165
                match(PARAM_TYPE)
                this.state = 166
                match(DATA_TYPE)
                this.state = 167
                isMandatory()
                this.state = 168
                comment()
                this.state = 172
                errorHandler.sync(this)
                _la = _input.LA(1)

                while (_la == ATTRIBUTES) {
                    if (true) {
                        if (true) {
                            this.state = 169
                            match(ATTRIBUTES)
                        }
                    }
                    this.state = 174
                    errorHandler.sync(this)
                    _la = _input.LA(1)
                }
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class CommentContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.comment.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun TEXT(): TerminalNode? = getToken(Tokens.TEXT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterComment(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitComment(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitComment(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun comment(): CommentContext {
        var _localctx = CommentContext(context, state)
        enterRule(_localctx, 42, Rules.comment.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 175
                match(TEXT)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class IsMandatoryContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.isMandatory.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun TRUE(): TerminalNode? = getToken(Tokens.TRUE.id, 0)
        public fun FALSE(): TerminalNode? = getToken(Tokens.FALSE.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterIsMandatory(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitIsMandatory(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitIsMandatory(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun isMandatory(): IsMandatoryContext {
        var _localctx = IsMandatoryContext(context, state)
        enterRule(_localctx, 44, Rules.isMandatory.id)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 177
                _la = _input.LA(1)

                if (!(_la == TRUE || _la == FALSE)) {
                    errorHandler.recoverInline(this)
                }
                else {
                    if (_input.LA(1) == Tokens.EOF.id) {
                        isMatchedEOF = true
                    }

                    errorHandler.reportMatch(this)
                    consume()
                }
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class SuccessContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.success.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun findReturnCode(): ReturnCodeContext? = getRuleContext(ReturnCodeContext::class, 0)
        public fun PARAM_TYPE(): TerminalNode? = getToken(Tokens.PARAM_TYPE.id, 0)
        public fun DATA_TYPE(): TerminalNode? = getToken(Tokens.DATA_TYPE.id, 0)
        public fun findComment(): CommentContext? = getRuleContext(CommentContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterSuccess(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitSuccess(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitSuccess(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun success(): SuccessContext {
        var _localctx = SuccessContext(context, state)
        enterRule(_localctx, 46, Rules.success.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 179
                returnCode()
                this.state = 180
                match(PARAM_TYPE)
                this.state = 181
                match(DATA_TYPE)
                this.state = 182
                comment()
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class FailureContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.failure.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun findReturnCode(): ReturnCodeContext? = getRuleContext(ReturnCodeContext::class, 0)
        public fun PARAM_TYPE(): TerminalNode? = getToken(Tokens.PARAM_TYPE.id, 0)
        public fun DATA_TYPE(): TerminalNode? = getToken(Tokens.DATA_TYPE.id, 0)
        public fun findComment(): CommentContext? = getRuleContext(CommentContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterFailure(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitFailure(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitFailure(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun failure(): FailureContext {
        var _localctx = FailureContext(context, state)
        enterRule(_localctx, 48, Rules.failure.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 184
                returnCode()
                this.state = 185
                match(PARAM_TYPE)
                this.state = 186
                match(DATA_TYPE)
                this.state = 187
                comment()
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class ResponseContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.response.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun findReturnCode(): ReturnCodeContext? = getRuleContext(ReturnCodeContext::class, 0)
        public fun PARAM_TYPE(): TerminalNode? = getToken(Tokens.PARAM_TYPE.id, 0)
        public fun DATA_TYPE(): TerminalNode? = getToken(Tokens.DATA_TYPE.id, 0)
        public fun findComment(): CommentContext? = getRuleContext(CommentContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterResponse(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitResponse(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitResponse(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun response(): ResponseContext {
        var _localctx = ResponseContext(context, state)
        enterRule(_localctx, 50, Rules.response.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 189
                returnCode()
                this.state = 190
                match(PARAM_TYPE)
                this.state = 191
                match(DATA_TYPE)
                this.state = 192
                comment()
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class HeaderContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.header.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun findReturnCode(): ReturnCodeContext? = getRuleContext(ReturnCodeContext::class, 0)
        public fun PARAM_TYPE(): TerminalNode? = getToken(Tokens.PARAM_TYPE.id, 0)
        public fun DATA_TYPE(): TerminalNode? = getToken(Tokens.DATA_TYPE.id, 0)
        public fun findComment(): CommentContext? = getRuleContext(CommentContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterHeader(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitHeader(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitHeader(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun header(): HeaderContext {
        var _localctx = HeaderContext(context, state)
        enterRule(_localctx, 52, Rules.header.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 194
                returnCode()
                this.state = 195
                match(PARAM_TYPE)
                this.state = 196
                match(DATA_TYPE)
                this.state = 197
                comment()
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class RouterContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.router.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun findPath(): PathContext? = getRuleContext(PathContext::class, 0)
        public fun HTTP_METHODS(): TerminalNode? = getToken(Tokens.HTTP_METHODS.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterRouter(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitRouter(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitRouter(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun router(): RouterContext {
        var _localctx = RouterContext(context, state)
        enterRule(_localctx, 54, Rules.router.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 199
                path()
                this.state = 200
                match(HTTP_METHODS)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class ExtensionsContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.extensions.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun EXTENSION_MARK(): TerminalNode? = getToken(Tokens.EXTENSION_MARK.id, 0)
        public fun findJson(): JsonContext? = getRuleContext(JsonContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterExtensions(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitExtensions(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitExtensions(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun extensions(): ExtensionsContext {
        var _localctx = ExtensionsContext(context, state)
        enterRule(_localctx, 56, Rules.extensions.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 202
                match(EXTENSION_MARK)
                this.state = 203
                json()
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class ReturnCodeContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.returnCode.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun INTEGER(): TerminalNode? = getToken(Tokens.INTEGER.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterReturnCode(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitReturnCode(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitReturnCode(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun returnCode(): ReturnCodeContext {
        var _localctx = ReturnCodeContext(context, state)
        enterRule(_localctx, 58, Rules.returnCode.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 205
                match(INTEGER)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class PathContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.path.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun IDENTIFIER(): TerminalNode? = getToken(Tokens.IDENTIFIER.id, 0)
        public fun SLASH(): TerminalNode? = getToken(Tokens.SLASH.id, 0)
        public fun LEFT_BRACE(): TerminalNode? = getToken(Tokens.LEFT_BRACE.id, 0)
        public fun RIGHT_BRACE(): TerminalNode? = getToken(Tokens.RIGHT_BRACE.id, 0)
        public fun STAR(): TerminalNode? = getToken(Tokens.STAR.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterPath(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitPath(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitPath(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun path(): PathContext {
        var _localctx = PathContext(context, state)
        enterRule(_localctx, 60, Rules.path.id)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 207
                _la = _input.LA(1)

                if (!((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 494797412368384L) != 0L))) {
                    errorHandler.recoverInline(this)
                }
                else {
                    if (_input.LA(1) == Tokens.EOF.id) {
                        isMatchedEOF = true
                    }

                    errorHandler.reportMatch(this)
                    consume()
                }
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class JsonContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.json.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun findValue(): ValueContext? = getRuleContext(ValueContext::class, 0)
        public fun EOF(): TerminalNode? = getToken(Tokens.EOF.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterJson(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitJson(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitJson(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun json(): JsonContext {
        var _localctx = JsonContext(context, state)
        enterRule(_localctx, 62, Rules.json.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 209
                value()
                this.state = 210
                match(EOF)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class ObjContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.obj.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun LEFT_BRACE(): TerminalNode? = getToken(Tokens.LEFT_BRACE.id, 0)
        public fun findPair(): List<PairContext> = getRuleContexts(PairContext::class)
        public fun findPair(i: Int): PairContext? = getRuleContext(PairContext::class, i)
        public fun RIGHT_BRACE(): TerminalNode? = getToken(Tokens.RIGHT_BRACE.id, 0)
        public fun COMMA(): List<TerminalNode> = getTokens(Tokens.COMMA.id)
        public fun COMMA(i: Int): TerminalNode = getToken(Tokens.COMMA.id, i)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterObj(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitObj(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitObj(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun obj(): ObjContext {
        var _localctx = ObjContext(context, state)
        enterRule(_localctx, 64, Rules.obj.id)
        var _la: Int

        try {
            this.state = 225
            errorHandler.sync(this)

            when (interpreter.adaptivePredict(_input, 5, context)) {
                1 -> {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 212
                        match(LEFT_BRACE)
                        this.state = 213
                        pair()
                        this.state = 218
                        errorHandler.sync(this)
                        _la = _input.LA(1)

                        while (_la == COMMA) {
                            if (true) {
                                if (true) {
                                    this.state = 214
                                    match(COMMA)
                                    this.state = 215
                                    pair()
                                }
                            }
                            this.state = 220
                            errorHandler.sync(this)
                            _la = _input.LA(1)
                        }
                        this.state = 221
                        match(RIGHT_BRACE)
                    }
                }2 -> {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 223
                        match(LEFT_BRACE)
                        this.state = 224
                        match(RIGHT_BRACE)
                    }
                }
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class PairContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.pair.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun STRING(): TerminalNode? = getToken(Tokens.STRING.id, 0)
        public fun COLON(): TerminalNode? = getToken(Tokens.COLON.id, 0)
        public fun findValue(): ValueContext? = getRuleContext(ValueContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterPair(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitPair(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitPair(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun pair(): PairContext {
        var _localctx = PairContext(context, state)
        enterRule(_localctx, 66, Rules.pair.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 227
                match(STRING)
                this.state = 228
                match(COLON)
                this.state = 229
                value()
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class ArrContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.arr.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun LEFT_BRACKET(): TerminalNode? = getToken(Tokens.LEFT_BRACKET.id, 0)
        public fun findValue(): List<ValueContext> = getRuleContexts(ValueContext::class)
        public fun findValue(i: Int): ValueContext? = getRuleContext(ValueContext::class, i)
        public fun RIGHT_BRACKET(): TerminalNode? = getToken(Tokens.RIGHT_BRACKET.id, 0)
        public fun COMMA(): List<TerminalNode> = getTokens(Tokens.COMMA.id)
        public fun COMMA(i: Int): TerminalNode = getToken(Tokens.COMMA.id, i)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterArr(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitArr(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitArr(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun arr(): ArrContext {
        var _localctx = ArrContext(context, state)
        enterRule(_localctx, 68, Rules.arr.id)
        var _la: Int

        try {
            this.state = 244
            errorHandler.sync(this)

            when (interpreter.adaptivePredict(_input, 7, context)) {
                1 -> {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 231
                        match(LEFT_BRACKET)
                        this.state = 232
                        value()
                        this.state = 237
                        errorHandler.sync(this)
                        _la = _input.LA(1)

                        while (_la == COMMA) {
                            if (true) {
                                if (true) {
                                    this.state = 233
                                    match(COMMA)
                                    this.state = 234
                                    value()
                                }
                            }
                            this.state = 239
                            errorHandler.sync(this)
                            _la = _input.LA(1)
                        }
                        this.state = 240
                        match(RIGHT_BRACKET)
                    }
                }2 -> {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 242
                        match(LEFT_BRACKET)
                        this.state = 243
                        match(RIGHT_BRACKET)
                    }
                }
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class ValueContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.value.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun STRING(): TerminalNode? = getToken(Tokens.STRING.id, 0)
        public fun NUMBER(): TerminalNode? = getToken(Tokens.NUMBER.id, 0)
        public fun findObj(): ObjContext? = getRuleContext(ObjContext::class, 0)
        public fun findArr(): ArrContext? = getRuleContext(ArrContext::class, 0)
        public fun TRUE(): TerminalNode? = getToken(Tokens.TRUE.id, 0)
        public fun FALSE(): TerminalNode? = getToken(Tokens.FALSE.id, 0)
        public fun NULL(): TerminalNode? = getToken(Tokens.NULL.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.enterValue(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagParserListener) {
                listener.exitValue(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagParserVisitor) {
                return visitor.visitValue(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun value(): ValueContext {
        var _localctx = ValueContext(context, state)
        enterRule(_localctx, 70, Rules.value.id)

        try {
            this.state = 253
            errorHandler.sync(this)

            when (_input.LA(1)) {
                STRING -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 246
                        match(STRING)
                    }
                }NUMBER -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 247
                        match(NUMBER)
                    }
                }LEFT_BRACE -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 3)
                    if (true) {
                        this.state = 248
                        obj()
                    }
                }LEFT_BRACKET -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 4)
                    if (true) {
                        this.state = 249
                        arr()
                    }
                }TRUE -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 5)
                    if (true) {
                        this.state = 250
                        match(TRUE)
                    }
                }FALSE -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 6)
                    if (true) {
                        this.state = 251
                        match(FALSE)
                    }
                }NULL -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 7)
                    if (true) {
                        this.state = 252
                        match(NULL)
                    }
                }
                else -> throw NoViableAltException(this)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

}