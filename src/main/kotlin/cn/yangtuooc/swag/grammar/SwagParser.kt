// Generated from /Users/yangtuo/projects/open-source/gin-endpoints/src/main/kotlin/cn/yangtuooc/swag/Swag.g4 by ANTLR 4.13.1
package cn.yangtuooc.swag.grammar

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
            "\u0004\u0001\u0048\u0159\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\u0008\u0007\u0008\u0002\u0009\u0007\u0009\u0002\u000a\u0007\u000a\u0002\u000b\u0007\u000b\u0002\u000c\u0007\u000c\u0002\u000d\u0007\u000d\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002\u0020\u0007\u0020\u0002\u0021\u0007\u0021\u0002\u0022\u0007\u0022\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u005d\u0008\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0008\u0001\u0008\u0001\u0008\u0001\u0008\u0001\u0008\u0001\u0008\u0001\u0009\u0001\u0009\u0001\u0009\u0001\u0009\u0001\u0009\u0001\u0009\u0001\u000a\u0001\u000a\u0001\u000a\u0001\u000a\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000c\u0001\u000c\u0001\u000c\u0001\u000c\u0001\u000d\u0001\u000d\u0001\u000d\u0004\u000d\u009d\u0008\u000d\u000b\u000d\u000c\u000d\u009e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00a4\u0008\u000e\u000a\u000e\u000c\u000e\u00a7\u0009\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ae\u0008\u000f\u000a\u000f\u000c\u000f\u00b1\u0009\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00b8\u0008\u0010\u000a\u0010\u000c\u0010\u00bb\u0009\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00c5\u0008\u0011\u000a\u0011\u000c\u0011\u00c8\u0009\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00e7\u0008\u0014\u000a\u0014\u000c\u0014\u00ea\u0009\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00f5\u0008\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0132\u0008\u001f\u000a\u001f\u000c\u001f\u0135\u0009\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u013b\u0008\u001f\u0001\u0020\u0001\u0020\u0001\u0020\u0001\u0020\u0001\u0021\u0001\u0021\u0001\u0021\u0001\u0021\u0005\u0021\u0145\u0008\u0021\u000a\u0021\u000c\u0021\u0148\u0009\u0021\u0001\u0021\u0001\u0021\u0001\u0021\u0001\u0021\u0003\u0021\u014e\u0008\u0021\u0001\u0022\u0001\u0022\u0001\u0022\u0001\u0022\u0001\u0022\u0001\u0022\u0001\u0022\u0003\u0022\u0157\u0008\u0022\u0001\u0022\u0000\u0000\u0023\u0000\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0000\u0002\u0001\u0000\u002c\u002d\u0001\u0000\u0025\u002b\u0161\u0000\u005c\u0001\u0000\u0000\u0000\u0002\u005e\u0001\u0000\u0000\u0000\u0004\u0062\u0001\u0000\u0000\u0000\u0006\u0066\u0001\u0000\u0000\u0000\u0008\u006a\u0001\u0000\u0000\u0000\u000a\u006e\u0001\u0000\u0000\u0000\u000c\u0074\u0001\u0000\u0000\u0000\u000e\u007a\u0001\u0000\u0000\u0000\u0010\u0080\u0001\u0000\u0000\u0000\u0012\u0086\u0001\u0000\u0000\u0000\u0014\u008c\u0001\u0000\u0000\u0000\u0016\u0090\u0001\u0000\u0000\u0000\u0018\u0095\u0001\u0000\u0000\u0000\u001a\u0099\u0001\u0000\u0000\u0000\u001c\u00a0\u0001\u0000\u0000\u0000\u001e\u00a8\u0001\u0000\u0000\u0000\u0020\u00b2\u0001\u0000\u0000\u0000\u0022\u00bc\u0001\u0000\u0000\u0000\u0024\u00c9\u0001\u0000\u0000\u0000\u0026\u00cb\u0001\u0000\u0000\u0000\u0028\u00f4\u0001\u0000\u0000\u0000\u002a\u00f6\u0001\u0000\u0000\u0000\u002c\u00ff\u0001\u0000\u0000\u0000\u002e\u0108\u0001\u0000\u0000\u0000\u0030\u0111\u0001\u0000\u0000\u0000\u0032\u011a\u0001\u0000\u0000\u0000\u0034\u011c\u0001\u0000\u0000\u0000\u0036\u0123\u0001\u0000\u0000\u0000\u0038\u0125\u0001\u0000\u0000\u0000\u003a\u0127\u0001\u0000\u0000\u0000\u003c\u012a\u0001\u0000\u0000\u0000\u003e\u013a\u0001\u0000\u0000\u0000\u0040\u013c\u0001\u0000\u0000\u0000\u0042\u014d\u0001\u0000\u0000\u0000\u0044\u0156\u0001\u0000\u0000\u0000\u0046\u005d\u0003\u0002\u0001\u0000\u0047\u005d\u0003\u0004\u0002\u0000\u0048\u005d\u0003\u0006\u0003\u0000\u0049\u005d\u0003\u0008\u0004\u0000\u004a\u005d\u0003\u000a\u0005\u0000\u004b\u005d\u0003\u000c\u0006\u0000\u004c\u005d\u0003\u000e\u0007\u0000\u004d\u005d\u0003\u0010\u0008\u0000\u004e\u005d\u0003\u0012\u0009\u0000\u004f\u005d\u0003\u0014\u000a\u0000\u0050\u005d\u0003\u0016\u000b\u0000\u0051\u005d\u0003\u0018\u000c\u0000\u0052\u005d\u0003\u001a\u000d\u0000\u0053\u005d\u0003\u001e\u000f\u0000\u0054\u005d\u0003\u0020\u0010\u0000\u0055\u005d\u0003\u0022\u0011\u0000\u0056\u005d\u0003\u002a\u0015\u0000\u0057\u005d\u0003\u002c\u0016\u0000\u0058\u005d\u0003\u002e\u0017\u0000\u0059\u005d\u0003\u0030\u0018\u0000\u005a\u005d\u0003\u0034\u001a\u0000\u005b\u005d\u0003\u003a\u001d\u0000\u005c\u0046\u0001\u0000\u0000\u0000\u005c\u0047\u0001\u0000\u0000\u0000\u005c\u0048\u0001\u0000\u0000\u0000\u005c\u0049\u0001\u0000\u0000\u0000\u005c\u004a\u0001\u0000\u0000\u0000\u005c\u004b\u0001\u0000\u0000\u0000\u005c\u004c\u0001\u0000\u0000\u0000\u005c\u004d\u0001\u0000\u0000\u0000\u005c\u004e\u0001\u0000\u0000\u0000\u005c\u004f\u0001\u0000\u0000\u0000\u005c\u0050\u0001\u0000\u0000\u0000\u005c\u0051\u0001\u0000\u0000\u0000\u005c\u0052\u0001\u0000\u0000\u0000\u005c\u0053\u0001\u0000\u0000\u0000\u005c\u0054\u0001\u0000\u0000\u0000\u005c\u0055\u0001\u0000\u0000\u0000\u005c\u0056\u0001\u0000\u0000\u0000\u005c\u0057\u0001\u0000\u0000\u0000\u005c\u0058\u0001\u0000\u0000\u0000\u005c\u0059\u0001\u0000\u0000\u0000\u005c\u005a\u0001\u0000\u0000\u0000\u005c\u005b\u0001\u0000\u0000\u0000\u005d\u0001\u0001\u0000\u0000\u0000\u005e\u005f\u0005\u0035\u0000\u0000\u005f\u0060\u0005\u0002\u0000\u0000\u0060\u0061\u0005\u0047\u0000\u0000\u0061\u0003\u0001\u0000\u0000\u0000\u0062\u0063\u0005\u0035\u0000\u0000\u0063\u0064\u0005\u0003\u0000\u0000\u0064\u0065\u0005\u0047\u0000\u0000\u0065\u0005\u0001\u0000\u0000\u0000\u0066\u0067\u0005\u0035\u0000\u0000\u0067\u0068\u0005\u0004\u0000\u0000\u0068\u0069\u0005\u0047\u0000\u0000\u0069\u0007\u0001\u0000\u0000\u0000\u006a\u006b\u0005\u0035\u0000\u0000\u006b\u006c\u0005\u0009\u0000\u0000\u006c\u006d\u0005\u0047\u0000\u0000\u006d\u0009\u0001\u0000\u0000\u0000\u006e\u006f\u0005\u0035\u0000\u0000\u006f\u0070\u0005\u0007\u0000\u0000\u0070\u0071\u0005\u0037\u0000\u0000\u0071\u0072\u0005\u0006\u0000\u0000\u0072\u0073\u0005\u0047\u0000\u0000\u0073\u000b\u0001\u0000\u0000\u0000\u0074\u0075\u0005\u0035\u0000\u0000\u0075\u0076\u0005\u0007\u0000\u0000\u0076\u0077\u0005\u0037\u0000\u0000\u0077\u0078\u0005\u000a\u0000\u0000\u0078\u0079\u0005\u0047\u0000\u0000\u0079\u000d\u0001\u0000\u0000\u0000\u007a\u007b\u0005\u0035\u0000\u0000\u007b\u007c\u0005\u0007\u0000\u0000\u007c\u007d\u0005\u0037\u0000\u0000\u007d\u007e\u0005\u000b\u0000\u0000\u007e\u007f\u0005\u0047\u0000\u0000\u007f\u000f\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0035\u0000\u0000\u0081\u0082\u0005\u0008\u0000\u0000\u0082\u0083\u0005\u0037\u0000\u0000\u0083\u0084\u0005\u0006\u0000\u0000\u0084\u0085\u0005\u0047\u0000\u0000\u0085\u0011\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0035\u0000\u0000\u0087\u0088\u0005\u0008\u0000\u0000\u0088\u0089\u0005\u0037\u0000\u0000\u0089\u008a\u0005\u000a\u0000\u0000\u008a\u008b\u0005\u0047\u0000\u0000\u008b\u0013\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0035\u0000\u0000\u008d\u008e\u0005\u0019\u0000\u0000\u008e\u008f\u0005\u0047\u0000\u0000\u008f\u0015\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0035\u0000\u0000\u0091\u0092\u0005\u000c\u0000\u0000\u0092\u0093\u0005\u000d\u0000\u0000\u0093\u0094\u0005\u0047\u0000\u0000\u0094\u0017\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0035\u0000\u0000\u0096\u0097\u0005\u0014\u0000\u0000\u0097\u0098\u0005\u0047\u0000\u0000\u0098\u0019\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0035\u0000\u0000\u009a\u009c\u0005\u0013\u0000\u0000\u009b\u009d\u0003\u001c\u000e\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u001b\u0001\u0000\u0000\u0000\u00a0\u00a5\u0005\u0047\u0000\u0000\u00a1\u00a2\u0005\u0038\u0000\u0000\u00a2\u00a4\u0005\u0047\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u001d\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0035\u0000\u0000\u00a9\u00aa\u0005\u0015\u0000\u0000\u00aa\u00af\u0005\u0034\u0000\u0000\u00ab\u00ac\u0005\u0038\u0000\u0000\u00ac\u00ae\u0005\u0034\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u001f\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0035\u0000\u0000\u00b3\u00b4\u0005\u0016\u0000\u0000\u00b4\u00b9\u0005\u0034\u0000\u0000\u00b5\u00b6\u0005\u0038\u0000\u0000\u00b6\u00b8\u0005\u0034\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u0021\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0035\u0000\u0000\u00bd\u00be\u0005\u0017\u0000\u0000\u00be\u00bf\u0005\u002f\u0000\u0000\u00bf\u00c0\u0005\u0031\u0000\u0000\u00c0\u00c1\u0005\u0032\u0000\u0000\u00c1\u00c2\u0003\u0024\u0012\u0000\u00c2\u00c6\u0003\u0026\u0013\u0000\u00c3\u00c5\u0003\u0028\u0014\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u0023\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca\u0007\u0000\u0000\u0000\u00ca\u0025\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0047\u0000\u0000\u00cc\u0027\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u001f\u0000\u0000\u00ce\u00cf\u0005\u003f\u0000\u0000\u00cf\u00d0\u0005\u0032\u0000\u0000\u00d0\u00f5\u0005\u0040\u0000\u0000\u00d1\u00d2\u0005\u0020\u0000\u0000\u00d2\u00d3\u0005\u003f\u0000\u0000\u00d3\u00d4\u0005\u0045\u0000\u0000\u00d4\u00f5\u0005\u0040\u0000\u0000\u00d5\u00d6\u0005\u0021\u0000\u0000\u00d6\u00d7\u0005\u003f\u0000\u0000\u00d7\u00d8\u0005\u0045\u0000\u0000\u00d8\u00f5\u0005\u0040\u0000\u0000\u00d9\u00da\u0005\u0022\u0000\u0000\u00da\u00db\u0005\u003f\u0000\u0000\u00db\u00dc\u0005\u0045\u0000\u0000\u00dc\u00f5\u0005\u0040\u0000\u0000\u00dd\u00de\u0005\u0023\u0000\u0000\u00de\u00df\u0005\u003f\u0000\u0000\u00df\u00e0\u0005\u0045\u0000\u0000\u00e0\u00f5\u0005\u0040\u0000\u0000\u00e1\u00e2\u0005\u0024\u0000\u0000\u00e2\u00e3\u0005\u003f\u0000\u0000\u00e3\u00e8\u0005\u002f\u0000\u0000\u00e4\u00e5\u0005\u0038\u0000\u0000\u00e5\u00e7\u0005\u002f\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00f5\u0005\u0040\u0000\u0000\u00ec\u00ed\u0005\u0010\u0000\u0000\u00ed\u00ee\u0005\u003f\u0000\u0000\u00ee\u00ef\u0005\u002f\u0000\u0000\u00ef\u00f5\u0005\u0040\u0000\u0000\u00f0\u00f1\u0005\u0001\u0000\u0000\u00f1\u00f2\u0005\u003f\u0000\u0000\u00f2\u00f3\u0005\u0033\u0000\u0000\u00f3\u00f5\u0005\u0040\u0000\u0000\u00f4\u00cd\u0001\u0000\u0000\u0000\u00f4\u00d1\u0001\u0000\u0000\u0000\u00f4\u00d5\u0001\u0000\u0000\u0000\u00f4\u00d9\u0001\u0000\u0000\u0000\u00f4\u00dd\u0001\u0000\u0000\u0000\u00f4\u00e1\u0001\u0000\u0000\u0000\u00f4\u00ec\u0001\u0000\u0000\u0000\u00f4\u00f0\u0001\u0000\u0000\u0000\u00f5\u0029\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0035\u0000\u0000\u00f7\u00f8\u0005\u001a\u0000\u0000\u00f8\u00f9\u0003\u0032\u0019\u0000\u00f9\u00fa\u0005\u0041\u0000\u0000\u00fa\u00fb\u0005\u0032\u0000\u0000\u00fb\u00fc\u0005\u0042\u0000\u0000\u00fc\u00fd\u0005\u0032\u0000\u0000\u00fd\u00fe\u0003\u0026\u0013\u0000\u00fe\u002b\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0035\u0000\u0000\u0100\u0101\u0005\u001b\u0000\u0000\u0101\u0102\u0003\u0032\u0019\u0000\u0102\u0103\u0005\u0041\u0000\u0000\u0103\u0104\u0005\u0032\u0000\u0000\u0104\u0105\u0005\u0042\u0000\u0000\u0105\u0106\u0005\u0032\u0000\u0000\u0106\u0107\u0003\u0026\u0013\u0000\u0107\u002d\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0035\u0000\u0000\u0109\u010a\u0005\u001c\u0000\u0000\u010a\u010b\u0003\u0032\u0019\u0000\u010b\u010c\u0005\u0041\u0000\u0000\u010c\u010d\u0005\u0032\u0000\u0000\u010d\u010e\u0005\u0042\u0000\u0000\u010e\u010f\u0005\u0032\u0000\u0000\u010f\u0110\u0003\u0026\u0013\u0000\u0110\u002f\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0035\u0000\u0000\u0112\u0113\u0005\u001d\u0000\u0000\u0113\u0114\u0003\u0032\u0019\u0000\u0114\u0115\u0005\u0041\u0000\u0000\u0115\u0116\u0005\u0032\u0000\u0000\u0116\u0117\u0005\u0042\u0000\u0000\u0117\u0118\u0005\u0032\u0000\u0000\u0118\u0119\u0003\u0026\u0013\u0000\u0119\u0031\u0001\u0000\u0000\u0000\u011a\u011b\u0005\u0030\u0000\u0000\u011b\u0033\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u0035\u0000\u0000\u011d\u011e\u0005\u001e\u0000\u0000\u011e\u011f\u0003\u0036\u001b\u0000\u011f\u0120\u0005\u003d\u0000\u0000\u0120\u0121\u0003\u0038\u001c\u0000\u0121\u0122\u0005\u003e\u0000\u0000\u0122\u0035\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0037\u0001\u0000\u0000\u0000\u0125\u0126\u0007\u0001\u0000\u0000\u0126\u0039\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0046\u0000\u0000\u0128\u0129\u0003\u003c\u001e\u0000\u0129\u003b\u0001\u0000\u0000\u0000\u012a\u012b\u0003\u0044\u0022\u0000\u012b\u012c\u0005\u0000\u0000\u0001\u012c\u003d\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u0041\u0000\u0000\u012e\u0133\u0003\u0040\u0020\u0000\u012f\u0130\u0005\u0038\u0000\u0000\u0130\u0132\u0003\u0040\u0020\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u0042\u0000\u0000\u0137\u013b\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u0041\u0000\u0000\u0139\u013b\u0005\u0042\u0000\u0000\u013a\u012d\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u003f\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0044\u0000\u0000\u013d\u013e\u0005\u0036\u0000\u0000\u013e\u013f\u0003\u0044\u0022\u0000\u013f\u0041\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u003d\u0000\u0000\u0141\u0146\u0003\u0044\u0022\u0000\u0142\u0143\u0005\u0038\u0000\u0000\u0143\u0145\u0003\u0044\u0022\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u003e\u0000\u0000\u014a\u014e\u0001\u0000\u0000\u0000\u014b\u014c\u0005\u003d\u0000\u0000\u014c\u014e\u0005\u003e\u0000\u0000\u014d\u0140\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u0043\u0001\u0000\u0000\u0000\u014f\u0157\u0005\u0044\u0000\u0000\u0150\u0157\u0005\u0045\u0000\u0000\u0151\u0157\u0003\u003e\u001f\u0000\u0152\u0157\u0003\u0042\u0021\u0000\u0153\u0157\u0005\u002c\u0000\u0000\u0154\u0157\u0005\u002d\u0000\u0000\u0155\u0157\u0005\u002e\u0000\u0000\u0156\u014f\u0001\u0000\u0000\u0000\u0156\u0150\u0001\u0000\u0000\u0000\u0156\u0151\u0001\u0000\u0000\u0000\u0156\u0152\u0001\u0000\u0000\u0000\u0156\u0153\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u0045\u0001\u0000\u0000\u0000\u000d\u005c\u009e\u00a5\u00af\u00b9\u00c6\u00e8\u00f4\u0133\u013a\u0146\u014d\u0156"

        private val ATN = ATNDeserializer().deserialize(SERIALIZED_ATN.toCharArray())

        private val DECISION_TO_DFA = Array(ATN.numberOfDecisions) {
            DFA(ATN.getDecisionState(it)!!, it)
        }

        private val SHARED_CONTEXT_CACHE = PredictionContextCache()
        private val RULE_NAMES: Array<String> =
            arrayOf("swag", "title", "version", "description", "termsOfService", 
                    "contactName", "contactUrl", "contactEmail", "licenseName", 
                    "licenseUrl", "host", "basePath", "summary", "tags", 
                    "tag", "accept", "produce", "param", "isMandatory", 
                    "comment", "attributes", "success", "failure", "response", 
                    "header", "returnCode", "router", "path", "httpMethod", 
                    "extensions", "json", "obj", "pair", "arr", "value")

        private val LITERAL_NAMES: Array<String?> =
            arrayOf(null, "'collectionFormat'", null, null, null, null, 
                    null, null, null, null, null, null, null, null, null, 
                    null, null, null, null, null, null, null, null, null, 
                    null, null, null, null, null, null, null, null, null, 
                    null, null, null, null, null, null, null, null, null, 
                    null, null, null, null, null, null, null, null, null, 
                    null, null, "'@'", "':'", "'.'", "','", "'*'", "'/'", 
                    "'-'", "'_'", "'['", "']'", "'('", "')'", "'{'", "'}'", 
                    "' '", null, null, "'x-'")

        private val SYMBOLIC_NAMES: Array<String?> =
            arrayOf(null, null, "TITLE", "VERSION", "DESCRIPTION", "TAG", 
                    "NAME", "CONTACT", "LICENSE", "TERMS_OF_SERVICE", "URL", 
                    "EMAIL", "BASE", "PATH", "QUERY", "COLLECTION", "FORMAT", 
                    "SCHEMA", "ID", "TAGS", "SUMMARY", "ACCEPT", "PRODUCE", 
                    "PARAM", "SECURITY", "HOST", "SUCCESS", "FAILURE", "RESPONSE", 
                    "HEADER", "ROUTER", "DEFAULT", "MAXIMUM", "MINIMUM", 
                    "MAX_LENGTH", "MIN_LENGTH", "ENUMS", "GET", "POST", 
                    "PUT", "DELETE", "PATCH", "HEAD", "OPTIONS", "TRUE", 
                    "FALSE", "NULL", "IDENTIFIER", "DIGITS", "REQUEST_TYPE", 
                    "DATA_TYPE", "COLLECTION_FORMAT", "MIME", "AT", "COLON", 
                    "DOT", "COMMA", "STAR", "SLASH", "DASH", "UNDERSCORE", 
                    "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_PAREN", "RIGHT_PAREN", 
                    "LEFT_BRACE", "RIGHT_BRACE", "SPACE", "STRING", "NUMBER", 
                    "EXTENSION_MARK", "TEXT_CONTENT", "WS")

        private val VOCABULARY = VocabularyImpl(LITERAL_NAMES, SYMBOLIC_NAMES)

        private val TOKEN_NAMES: Array<String> = Array(SYMBOLIC_NAMES.size) {
            VOCABULARY.getLiteralName(it)
                ?: VOCABULARY.getSymbolicName(it)
                ?: "<INVALID>"
        }
    }

    public enum class Tokens(public val id: kotlin.Int) {
        EOF(-1),
        `T__0`(1),
        `TITLE`(2),
        `VERSION`(3),
        `DESCRIPTION`(4),
        `TAG`(5),
        `NAME`(6),
        `CONTACT`(7),
        `LICENSE`(8),
        `TERMS_OF_SERVICE`(9),
        `URL`(10),
        `EMAIL`(11),
        `BASE`(12),
        `PATH`(13),
        `QUERY`(14),
        `COLLECTION`(15),
        `FORMAT`(16),
        `SCHEMA`(17),
        `ID`(18),
        `TAGS`(19),
        `SUMMARY`(20),
        `ACCEPT`(21),
        `PRODUCE`(22),
        `PARAM`(23),
        `SECURITY`(24),
        `HOST`(25),
        `SUCCESS`(26),
        `FAILURE`(27),
        `RESPONSE`(28),
        `HEADER`(29),
        `ROUTER`(30),
        `DEFAULT`(31),
        `MAXIMUM`(32),
        `MINIMUM`(33),
        `MAX_LENGTH`(34),
        `MIN_LENGTH`(35),
        `ENUMS`(36),
        `GET`(37),
        `POST`(38),
        `PUT`(39),
        `DELETE`(40),
        `PATCH`(41),
        `HEAD`(42),
        `OPTIONS`(43),
        `TRUE`(44),
        `FALSE`(45),
        `NULL`(46),
        `IDENTIFIER`(47),
        `DIGITS`(48),
        `REQUEST_TYPE`(49),
        `DATA_TYPE`(50),
        `COLLECTION_FORMAT`(51),
        `MIME`(52),
        `AT`(53),
        `COLON`(54),
        `DOT`(55),
        `COMMA`(56),
        `STAR`(57),
        `SLASH`(58),
        `DASH`(59),
        `UNDERSCORE`(60),
        `LEFT_BRACKET`(61),
        `RIGHT_BRACKET`(62),
        `LEFT_PAREN`(63),
        `RIGHT_PAREN`(64),
        `LEFT_BRACE`(65),
        `RIGHT_BRACE`(66),
        `SPACE`(67),
        `STRING`(68),
        `NUMBER`(69),
        `EXTENSION_MARK`(70),
        `TEXT_CONTENT`(71),
        `WS`(72)
    }

    public enum class Rules(public val id: kotlin.Int) {
        `swag`(0),
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
        `summary`(12),
        `tags`(13),
        `tag`(14),
        `accept`(15),
        `produce`(16),
        `param`(17),
        `isMandatory`(18),
        `comment`(19),
        `attributes`(20),
        `success`(21),
        `failure`(22),
        `response`(23),
        `header`(24),
        `returnCode`(25),
        `router`(26),
        `path`(27),
        `httpMethod`(28),
        `extensions`(29),
        `json`(30),
        `obj`(31),
        `pair`(32),
        `arr`(33),
        `value`(34)
    }

    override var interpreter: ParserATNSimulator =
        @Suppress("LeakingThis")
        ParserATNSimulator(this, ATN, DECISION_TO_DFA, SHARED_CONTEXT_CACHE)

    override val grammarFileName: String =
        "Swag.g4"

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

    private val T__0 = Tokens.T__0.id
    private val TITLE = Tokens.TITLE.id
    private val VERSION = Tokens.VERSION.id
    private val DESCRIPTION = Tokens.DESCRIPTION.id
    private val TAG = Tokens.TAG.id
    private val NAME = Tokens.NAME.id
    private val CONTACT = Tokens.CONTACT.id
    private val LICENSE = Tokens.LICENSE.id
    private val TERMS_OF_SERVICE = Tokens.TERMS_OF_SERVICE.id
    private val URL = Tokens.URL.id
    private val EMAIL = Tokens.EMAIL.id
    private val BASE = Tokens.BASE.id
    private val PATH = Tokens.PATH.id
    private val QUERY = Tokens.QUERY.id
    private val COLLECTION = Tokens.COLLECTION.id
    private val FORMAT = Tokens.FORMAT.id
    private val SCHEMA = Tokens.SCHEMA.id
    private val ID = Tokens.ID.id
    private val TAGS = Tokens.TAGS.id
    private val SUMMARY = Tokens.SUMMARY.id
    private val ACCEPT = Tokens.ACCEPT.id
    private val PRODUCE = Tokens.PRODUCE.id
    private val PARAM = Tokens.PARAM.id
    private val SECURITY = Tokens.SECURITY.id
    private val HOST = Tokens.HOST.id
    private val SUCCESS = Tokens.SUCCESS.id
    private val FAILURE = Tokens.FAILURE.id
    private val RESPONSE = Tokens.RESPONSE.id
    private val HEADER = Tokens.HEADER.id
    private val ROUTER = Tokens.ROUTER.id
    private val DEFAULT = Tokens.DEFAULT.id
    private val MAXIMUM = Tokens.MAXIMUM.id
    private val MINIMUM = Tokens.MINIMUM.id
    private val MAX_LENGTH = Tokens.MAX_LENGTH.id
    private val MIN_LENGTH = Tokens.MIN_LENGTH.id
    private val ENUMS = Tokens.ENUMS.id
    private val GET = Tokens.GET.id
    private val POST = Tokens.POST.id
    private val PUT = Tokens.PUT.id
    private val DELETE = Tokens.DELETE.id
    private val PATCH = Tokens.PATCH.id
    private val HEAD = Tokens.HEAD.id
    private val OPTIONS = Tokens.OPTIONS.id
    private val TRUE = Tokens.TRUE.id
    private val FALSE = Tokens.FALSE.id
    private val NULL = Tokens.NULL.id
    private val IDENTIFIER = Tokens.IDENTIFIER.id
    private val DIGITS = Tokens.DIGITS.id
    private val REQUEST_TYPE = Tokens.REQUEST_TYPE.id
    private val DATA_TYPE = Tokens.DATA_TYPE.id
    private val COLLECTION_FORMAT = Tokens.COLLECTION_FORMAT.id
    private val MIME = Tokens.MIME.id
    private val AT = Tokens.AT.id
    private val COLON = Tokens.COLON.id
    private val DOT = Tokens.DOT.id
    private val COMMA = Tokens.COMMA.id
    private val STAR = Tokens.STAR.id
    private val SLASH = Tokens.SLASH.id
    private val DASH = Tokens.DASH.id
    private val UNDERSCORE = Tokens.UNDERSCORE.id
    private val LEFT_BRACKET = Tokens.LEFT_BRACKET.id
    private val RIGHT_BRACKET = Tokens.RIGHT_BRACKET.id
    private val LEFT_PAREN = Tokens.LEFT_PAREN.id
    private val RIGHT_PAREN = Tokens.RIGHT_PAREN.id
    private val LEFT_BRACE = Tokens.LEFT_BRACE.id
    private val RIGHT_BRACE = Tokens.RIGHT_BRACE.id
    private val SPACE = Tokens.SPACE.id
    private val STRING = Tokens.STRING.id
    private val NUMBER = Tokens.NUMBER.id
    private val EXTENSION_MARK = Tokens.EXTENSION_MARK.id
    private val TEXT_CONTENT = Tokens.TEXT_CONTENT.id
    private val WS = Tokens.WS.id

    /* Named actions */

    /* Funcs */
    @Suppress("FunctionName")
    public open class SwagContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.swag.id
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
            if (listener is SwagListener) {
                listener.enterSwag(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitSwag(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitSwag(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun swag(): SwagContext {
        var _localctx = SwagContext(context, state)
        enterRule(_localctx, 0, Rules.swag.id)

        try {
            this.state = 92
            errorHandler.sync(this)

            when (interpreter.adaptivePredict(_input, 0, context)) {
                1 -> {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 70
                        title()
                    }
                }2 -> {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 71
                        version()
                    }
                }3 -> {
                    enterOuterAlt(_localctx, 3)
                    if (true) {
                        this.state = 72
                        description()
                    }
                }4 -> {
                    enterOuterAlt(_localctx, 4)
                    if (true) {
                        this.state = 73
                        termsOfService()
                    }
                }5 -> {
                    enterOuterAlt(_localctx, 5)
                    if (true) {
                        this.state = 74
                        contactName()
                    }
                }6 -> {
                    enterOuterAlt(_localctx, 6)
                    if (true) {
                        this.state = 75
                        contactUrl()
                    }
                }7 -> {
                    enterOuterAlt(_localctx, 7)
                    if (true) {
                        this.state = 76
                        contactEmail()
                    }
                }8 -> {
                    enterOuterAlt(_localctx, 8)
                    if (true) {
                        this.state = 77
                        licenseName()
                    }
                }9 -> {
                    enterOuterAlt(_localctx, 9)
                    if (true) {
                        this.state = 78
                        licenseUrl()
                    }
                }10 -> {
                    enterOuterAlt(_localctx, 10)
                    if (true) {
                        this.state = 79
                        host()
                    }
                }11 -> {
                    enterOuterAlt(_localctx, 11)
                    if (true) {
                        this.state = 80
                        basePath()
                    }
                }12 -> {
                    enterOuterAlt(_localctx, 12)
                    if (true) {
                        this.state = 81
                        summary()
                    }
                }13 -> {
                    enterOuterAlt(_localctx, 13)
                    if (true) {
                        this.state = 82
                        tags()
                    }
                }14 -> {
                    enterOuterAlt(_localctx, 14)
                    if (true) {
                        this.state = 83
                        accept()
                    }
                }15 -> {
                    enterOuterAlt(_localctx, 15)
                    if (true) {
                        this.state = 84
                        produce()
                    }
                }16 -> {
                    enterOuterAlt(_localctx, 16)
                    if (true) {
                        this.state = 85
                        param()
                    }
                }17 -> {
                    enterOuterAlt(_localctx, 17)
                    if (true) {
                        this.state = 86
                        success()
                    }
                }18 -> {
                    enterOuterAlt(_localctx, 18)
                    if (true) {
                        this.state = 87
                        failure()
                    }
                }19 -> {
                    enterOuterAlt(_localctx, 19)
                    if (true) {
                        this.state = 88
                        response()
                    }
                }20 -> {
                    enterOuterAlt(_localctx, 20)
                    if (true) {
                        this.state = 89
                        header()
                    }
                }21 -> {
                    enterOuterAlt(_localctx, 21)
                    if (true) {
                        this.state = 90
                        router()
                    }
                }22 -> {
                    enterOuterAlt(_localctx, 22)
                    if (true) {
                        this.state = 91
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun TITLE(): TerminalNode? = getToken(Tokens.TITLE.id, 0)
        public fun TEXT_CONTENT(): TerminalNode? = getToken(Tokens.TEXT_CONTENT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterTitle(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitTitle(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
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
                this.state = 94
                match(AT)
                this.state = 95
                match(TITLE)
                this.state = 96
                match(TEXT_CONTENT)
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun VERSION(): TerminalNode? = getToken(Tokens.VERSION.id, 0)
        public fun TEXT_CONTENT(): TerminalNode? = getToken(Tokens.TEXT_CONTENT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterVersion(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitVersion(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
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
                this.state = 98
                match(AT)
                this.state = 99
                match(VERSION)
                this.state = 100
                match(TEXT_CONTENT)
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun DESCRIPTION(): TerminalNode? = getToken(Tokens.DESCRIPTION.id, 0)
        public fun TEXT_CONTENT(): TerminalNode? = getToken(Tokens.TEXT_CONTENT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterDescription(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitDescription(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
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
                this.state = 102
                match(AT)
                this.state = 103
                match(DESCRIPTION)
                this.state = 104
                match(TEXT_CONTENT)
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun TERMS_OF_SERVICE(): TerminalNode? = getToken(Tokens.TERMS_OF_SERVICE.id, 0)
        public fun TEXT_CONTENT(): TerminalNode? = getToken(Tokens.TEXT_CONTENT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterTermsOfService(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitTermsOfService(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
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
                this.state = 106
                match(AT)
                this.state = 107
                match(TERMS_OF_SERVICE)
                this.state = 108
                match(TEXT_CONTENT)
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun CONTACT(): TerminalNode? = getToken(Tokens.CONTACT.id, 0)
        public fun DOT(): TerminalNode? = getToken(Tokens.DOT.id, 0)
        public fun NAME(): TerminalNode? = getToken(Tokens.NAME.id, 0)
        public fun TEXT_CONTENT(): TerminalNode? = getToken(Tokens.TEXT_CONTENT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterContactName(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitContactName(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
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
                this.state = 110
                match(AT)
                this.state = 111
                match(CONTACT)
                this.state = 112
                match(DOT)
                this.state = 113
                match(NAME)
                this.state = 114
                match(TEXT_CONTENT)
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun CONTACT(): TerminalNode? = getToken(Tokens.CONTACT.id, 0)
        public fun DOT(): TerminalNode? = getToken(Tokens.DOT.id, 0)
        public fun URL(): TerminalNode? = getToken(Tokens.URL.id, 0)
        public fun TEXT_CONTENT(): TerminalNode? = getToken(Tokens.TEXT_CONTENT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterContactUrl(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitContactUrl(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
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
                this.state = 116
                match(AT)
                this.state = 117
                match(CONTACT)
                this.state = 118
                match(DOT)
                this.state = 119
                match(URL)
                this.state = 120
                match(TEXT_CONTENT)
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun CONTACT(): TerminalNode? = getToken(Tokens.CONTACT.id, 0)
        public fun DOT(): TerminalNode? = getToken(Tokens.DOT.id, 0)
        public fun EMAIL(): TerminalNode? = getToken(Tokens.EMAIL.id, 0)
        public fun TEXT_CONTENT(): TerminalNode? = getToken(Tokens.TEXT_CONTENT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterContactEmail(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitContactEmail(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
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
                this.state = 122
                match(AT)
                this.state = 123
                match(CONTACT)
                this.state = 124
                match(DOT)
                this.state = 125
                match(EMAIL)
                this.state = 126
                match(TEXT_CONTENT)
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun LICENSE(): TerminalNode? = getToken(Tokens.LICENSE.id, 0)
        public fun DOT(): TerminalNode? = getToken(Tokens.DOT.id, 0)
        public fun NAME(): TerminalNode? = getToken(Tokens.NAME.id, 0)
        public fun TEXT_CONTENT(): TerminalNode? = getToken(Tokens.TEXT_CONTENT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterLicenseName(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitLicenseName(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
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
                this.state = 128
                match(AT)
                this.state = 129
                match(LICENSE)
                this.state = 130
                match(DOT)
                this.state = 131
                match(NAME)
                this.state = 132
                match(TEXT_CONTENT)
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun LICENSE(): TerminalNode? = getToken(Tokens.LICENSE.id, 0)
        public fun DOT(): TerminalNode? = getToken(Tokens.DOT.id, 0)
        public fun URL(): TerminalNode? = getToken(Tokens.URL.id, 0)
        public fun TEXT_CONTENT(): TerminalNode? = getToken(Tokens.TEXT_CONTENT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterLicenseUrl(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitLicenseUrl(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitLicenseUrl(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun licenseUrl(): LicenseUrlContext {
        var _localctx = LicenseUrlContext(context, state)
        enterRule(_localctx, 18, Rules.licenseUrl.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 134
                match(AT)
                this.state = 135
                match(LICENSE)
                this.state = 136
                match(DOT)
                this.state = 137
                match(URL)
                this.state = 138
                match(TEXT_CONTENT)
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun HOST(): TerminalNode? = getToken(Tokens.HOST.id, 0)
        public fun TEXT_CONTENT(): TerminalNode? = getToken(Tokens.TEXT_CONTENT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterHost(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitHost(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
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
                this.state = 140
                match(AT)
                this.state = 141
                match(HOST)
                this.state = 142
                match(TEXT_CONTENT)
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun BASE(): TerminalNode? = getToken(Tokens.BASE.id, 0)
        public fun PATH(): TerminalNode? = getToken(Tokens.PATH.id, 0)
        public fun TEXT_CONTENT(): TerminalNode? = getToken(Tokens.TEXT_CONTENT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterBasePath(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitBasePath(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
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
                this.state = 144
                match(AT)
                this.state = 145
                match(BASE)
                this.state = 146
                match(PATH)
                this.state = 147
                match(TEXT_CONTENT)
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun SUMMARY(): TerminalNode? = getToken(Tokens.SUMMARY.id, 0)
        public fun TEXT_CONTENT(): TerminalNode? = getToken(Tokens.TEXT_CONTENT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterSummary(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitSummary(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitSummary(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun summary(): SummaryContext {
        var _localctx = SummaryContext(context, state)
        enterRule(_localctx, 24, Rules.summary.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 149
                match(AT)
                this.state = 150
                match(SUMMARY)
                this.state = 151
                match(TEXT_CONTENT)
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun TAGS(): TerminalNode? = getToken(Tokens.TAGS.id, 0)
        public fun findTag(): List<TagContext> = getRuleContexts(TagContext::class)
        public fun findTag(i: Int): TagContext? = getRuleContext(TagContext::class, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterTags(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitTags(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitTags(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun tags(): TagsContext {
        var _localctx = TagsContext(context, state)
        enterRule(_localctx, 26, Rules.tags.id)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 153
                match(AT)
                this.state = 154
                match(TAGS)
                this.state = 156 
                errorHandler.sync(this)
                _la = _input.LA(1)

                do {
                    if (true) {
                        if (true) {
                            this.state = 155
                            tag()
                        }
                    }
                    this.state = 158 
                    errorHandler.sync(this)
                    _la = _input.LA(1)
                } while (_la == TEXT_CONTENT)
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

        public fun TEXT_CONTENT(): List<TerminalNode> = getTokens(Tokens.TEXT_CONTENT.id)
        public fun TEXT_CONTENT(i: Int): TerminalNode = getToken(Tokens.TEXT_CONTENT.id, i)!!
        public fun COMMA(): List<TerminalNode> = getTokens(Tokens.COMMA.id)
        public fun COMMA(i: Int): TerminalNode = getToken(Tokens.COMMA.id, i)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterTag(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitTag(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitTag(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun tag(): TagContext {
        var _localctx = TagContext(context, state)
        enterRule(_localctx, 28, Rules.tag.id)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 160
                match(TEXT_CONTENT)
                this.state = 165
                errorHandler.sync(this)
                _la = _input.LA(1)

                while (_la == COMMA) {
                    if (true) {
                        if (true) {
                            this.state = 161
                            match(COMMA)
                            this.state = 162
                            match(TEXT_CONTENT)
                        }
                    }
                    this.state = 167
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun ACCEPT(): TerminalNode? = getToken(Tokens.ACCEPT.id, 0)
        public fun MIME(): List<TerminalNode> = getTokens(Tokens.MIME.id)
        public fun MIME(i: Int): TerminalNode = getToken(Tokens.MIME.id, i)!!
        public fun COMMA(): List<TerminalNode> = getTokens(Tokens.COMMA.id)
        public fun COMMA(i: Int): TerminalNode = getToken(Tokens.COMMA.id, i)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterAccept(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitAccept(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitAccept(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun accept(): AcceptContext {
        var _localctx = AcceptContext(context, state)
        enterRule(_localctx, 30, Rules.accept.id)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 168
                match(AT)
                this.state = 169
                match(ACCEPT)
                this.state = 170
                match(MIME)
                this.state = 175
                errorHandler.sync(this)
                _la = _input.LA(1)

                while (_la == COMMA) {
                    if (true) {
                        if (true) {
                            this.state = 171
                            match(COMMA)
                            this.state = 172
                            match(MIME)
                        }
                    }
                    this.state = 177
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
    public open class ProduceContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.produce.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun PRODUCE(): TerminalNode? = getToken(Tokens.PRODUCE.id, 0)
        public fun MIME(): List<TerminalNode> = getTokens(Tokens.MIME.id)
        public fun MIME(i: Int): TerminalNode = getToken(Tokens.MIME.id, i)!!
        public fun COMMA(): List<TerminalNode> = getTokens(Tokens.COMMA.id)
        public fun COMMA(i: Int): TerminalNode = getToken(Tokens.COMMA.id, i)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterProduce(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitProduce(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitProduce(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun produce(): ProduceContext {
        var _localctx = ProduceContext(context, state)
        enterRule(_localctx, 32, Rules.produce.id)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 178
                match(AT)
                this.state = 179
                match(PRODUCE)
                this.state = 180
                match(MIME)
                this.state = 185
                errorHandler.sync(this)
                _la = _input.LA(1)

                while (_la == COMMA) {
                    if (true) {
                        if (true) {
                            this.state = 181
                            match(COMMA)
                            this.state = 182
                            match(MIME)
                        }
                    }
                    this.state = 187
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
    public open class ParamContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.param.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun PARAM(): TerminalNode? = getToken(Tokens.PARAM.id, 0)
        public fun IDENTIFIER(): TerminalNode? = getToken(Tokens.IDENTIFIER.id, 0)
        public fun REQUEST_TYPE(): TerminalNode? = getToken(Tokens.REQUEST_TYPE.id, 0)
        public fun DATA_TYPE(): TerminalNode? = getToken(Tokens.DATA_TYPE.id, 0)
        public fun findIsMandatory(): IsMandatoryContext? = getRuleContext(IsMandatoryContext::class, 0)
        public fun findComment(): CommentContext? = getRuleContext(CommentContext::class, 0)
        public fun findAttributes(): List<AttributesContext> = getRuleContexts(AttributesContext::class)
        public fun findAttributes(i: Int): AttributesContext? = getRuleContext(AttributesContext::class, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterParam(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitParam(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitParam(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun param(): ParamContext {
        var _localctx = ParamContext(context, state)
        enterRule(_localctx, 34, Rules.param.id)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 188
                match(AT)
                this.state = 189
                match(PARAM)
                this.state = 190
                match(IDENTIFIER)
                this.state = 191
                match(REQUEST_TYPE)
                this.state = 192
                match(DATA_TYPE)
                this.state = 193
                isMandatory()
                this.state = 194
                comment()
                this.state = 198
                errorHandler.sync(this)
                _la = _input.LA(1)

                while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 135291535362L) != 0L)) {
                    if (true) {
                        if (true) {
                            this.state = 195
                            attributes()
                        }
                    }
                    this.state = 200
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
    public open class IsMandatoryContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.isMandatory.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun TRUE(): TerminalNode? = getToken(Tokens.TRUE.id, 0)
        public fun FALSE(): TerminalNode? = getToken(Tokens.FALSE.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterIsMandatory(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitIsMandatory(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitIsMandatory(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun isMandatory(): IsMandatoryContext {
        var _localctx = IsMandatoryContext(context, state)
        enterRule(_localctx, 36, Rules.isMandatory.id)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 201
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
    public open class CommentContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.comment.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun TEXT_CONTENT(): TerminalNode? = getToken(Tokens.TEXT_CONTENT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterComment(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitComment(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitComment(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun comment(): CommentContext {
        var _localctx = CommentContext(context, state)
        enterRule(_localctx, 38, Rules.comment.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 203
                match(TEXT_CONTENT)
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
    public open class AttributesContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.attributes.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun DEFAULT(): TerminalNode? = getToken(Tokens.DEFAULT.id, 0)
        public fun LEFT_PAREN(): TerminalNode? = getToken(Tokens.LEFT_PAREN.id, 0)
        public fun DATA_TYPE(): TerminalNode? = getToken(Tokens.DATA_TYPE.id, 0)
        public fun RIGHT_PAREN(): TerminalNode? = getToken(Tokens.RIGHT_PAREN.id, 0)
        public fun MAXIMUM(): TerminalNode? = getToken(Tokens.MAXIMUM.id, 0)
        public fun NUMBER(): TerminalNode? = getToken(Tokens.NUMBER.id, 0)
        public fun MINIMUM(): TerminalNode? = getToken(Tokens.MINIMUM.id, 0)
        public fun MAX_LENGTH(): TerminalNode? = getToken(Tokens.MAX_LENGTH.id, 0)
        public fun MIN_LENGTH(): TerminalNode? = getToken(Tokens.MIN_LENGTH.id, 0)
        public fun ENUMS(): TerminalNode? = getToken(Tokens.ENUMS.id, 0)
        public fun IDENTIFIER(): List<TerminalNode> = getTokens(Tokens.IDENTIFIER.id)
        public fun IDENTIFIER(i: Int): TerminalNode = getToken(Tokens.IDENTIFIER.id, i)!!
        public fun COMMA(): List<TerminalNode> = getTokens(Tokens.COMMA.id)
        public fun COMMA(i: Int): TerminalNode = getToken(Tokens.COMMA.id, i)!!
        public fun FORMAT(): TerminalNode? = getToken(Tokens.FORMAT.id, 0)
        public fun COLLECTION_FORMAT(): TerminalNode? = getToken(Tokens.COLLECTION_FORMAT.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterAttributes(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitAttributes(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitAttributes(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun attributes(): AttributesContext {
        var _localctx = AttributesContext(context, state)
        enterRule(_localctx, 40, Rules.attributes.id)
        var _la: Int

        try {
            this.state = 244
            errorHandler.sync(this)

            when (_input.LA(1)) {
                DEFAULT -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 205
                        match(DEFAULT)
                        this.state = 206
                        match(LEFT_PAREN)
                        this.state = 207
                        match(DATA_TYPE)
                        this.state = 208
                        match(RIGHT_PAREN)
                    }
                }MAXIMUM -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 209
                        match(MAXIMUM)
                        this.state = 210
                        match(LEFT_PAREN)
                        this.state = 211
                        match(NUMBER)
                        this.state = 212
                        match(RIGHT_PAREN)
                    }
                }MINIMUM -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 3)
                    if (true) {
                        this.state = 213
                        match(MINIMUM)
                        this.state = 214
                        match(LEFT_PAREN)
                        this.state = 215
                        match(NUMBER)
                        this.state = 216
                        match(RIGHT_PAREN)
                    }
                }MAX_LENGTH -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 4)
                    if (true) {
                        this.state = 217
                        match(MAX_LENGTH)
                        this.state = 218
                        match(LEFT_PAREN)
                        this.state = 219
                        match(NUMBER)
                        this.state = 220
                        match(RIGHT_PAREN)
                    }
                }MIN_LENGTH -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 5)
                    if (true) {
                        this.state = 221
                        match(MIN_LENGTH)
                        this.state = 222
                        match(LEFT_PAREN)
                        this.state = 223
                        match(NUMBER)
                        this.state = 224
                        match(RIGHT_PAREN)
                    }
                }ENUMS -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 6)
                    if (true) {
                        this.state = 225
                        match(ENUMS)
                        this.state = 226
                        match(LEFT_PAREN)
                        this.state = 227
                        match(IDENTIFIER)
                        this.state = 232
                        errorHandler.sync(this)
                        _la = _input.LA(1)

                        while (_la == COMMA) {
                            if (true) {
                                if (true) {
                                    this.state = 228
                                    match(COMMA)
                                    this.state = 229
                                    match(IDENTIFIER)
                                }
                            }
                            this.state = 234
                            errorHandler.sync(this)
                            _la = _input.LA(1)
                        }
                        this.state = 235
                        match(RIGHT_PAREN)
                    }
                }FORMAT -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 7)
                    if (true) {
                        this.state = 236
                        match(FORMAT)
                        this.state = 237
                        match(LEFT_PAREN)
                        this.state = 238
                        match(IDENTIFIER)
                        this.state = 239
                        match(RIGHT_PAREN)
                    }
                }T__0 -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 8)
                    if (true) {
                        this.state = 240
                        match(T__0)
                        this.state = 241
                        match(LEFT_PAREN)
                        this.state = 242
                        match(COLLECTION_FORMAT)
                        this.state = 243
                        match(RIGHT_PAREN)
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

    @Suppress("FunctionName")
    public open class SuccessContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.success.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun SUCCESS(): TerminalNode? = getToken(Tokens.SUCCESS.id, 0)
        public fun findReturnCode(): ReturnCodeContext? = getRuleContext(ReturnCodeContext::class, 0)
        public fun LEFT_BRACE(): TerminalNode? = getToken(Tokens.LEFT_BRACE.id, 0)
        public fun DATA_TYPE(): List<TerminalNode> = getTokens(Tokens.DATA_TYPE.id)
        public fun DATA_TYPE(i: Int): TerminalNode = getToken(Tokens.DATA_TYPE.id, i)!!
        public fun RIGHT_BRACE(): TerminalNode? = getToken(Tokens.RIGHT_BRACE.id, 0)
        public fun findComment(): CommentContext? = getRuleContext(CommentContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterSuccess(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitSuccess(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitSuccess(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun success(): SuccessContext {
        var _localctx = SuccessContext(context, state)
        enterRule(_localctx, 42, Rules.success.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 246
                match(AT)
                this.state = 247
                match(SUCCESS)
                this.state = 248
                returnCode()
                this.state = 249
                match(LEFT_BRACE)
                this.state = 250
                match(DATA_TYPE)
                this.state = 251
                match(RIGHT_BRACE)
                this.state = 252
                match(DATA_TYPE)
                this.state = 253
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun FAILURE(): TerminalNode? = getToken(Tokens.FAILURE.id, 0)
        public fun findReturnCode(): ReturnCodeContext? = getRuleContext(ReturnCodeContext::class, 0)
        public fun LEFT_BRACE(): TerminalNode? = getToken(Tokens.LEFT_BRACE.id, 0)
        public fun DATA_TYPE(): List<TerminalNode> = getTokens(Tokens.DATA_TYPE.id)
        public fun DATA_TYPE(i: Int): TerminalNode = getToken(Tokens.DATA_TYPE.id, i)!!
        public fun RIGHT_BRACE(): TerminalNode? = getToken(Tokens.RIGHT_BRACE.id, 0)
        public fun findComment(): CommentContext? = getRuleContext(CommentContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterFailure(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitFailure(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitFailure(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun failure(): FailureContext {
        var _localctx = FailureContext(context, state)
        enterRule(_localctx, 44, Rules.failure.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 255
                match(AT)
                this.state = 256
                match(FAILURE)
                this.state = 257
                returnCode()
                this.state = 258
                match(LEFT_BRACE)
                this.state = 259
                match(DATA_TYPE)
                this.state = 260
                match(RIGHT_BRACE)
                this.state = 261
                match(DATA_TYPE)
                this.state = 262
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun RESPONSE(): TerminalNode? = getToken(Tokens.RESPONSE.id, 0)
        public fun findReturnCode(): ReturnCodeContext? = getRuleContext(ReturnCodeContext::class, 0)
        public fun LEFT_BRACE(): TerminalNode? = getToken(Tokens.LEFT_BRACE.id, 0)
        public fun DATA_TYPE(): List<TerminalNode> = getTokens(Tokens.DATA_TYPE.id)
        public fun DATA_TYPE(i: Int): TerminalNode = getToken(Tokens.DATA_TYPE.id, i)!!
        public fun RIGHT_BRACE(): TerminalNode? = getToken(Tokens.RIGHT_BRACE.id, 0)
        public fun findComment(): CommentContext? = getRuleContext(CommentContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterResponse(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitResponse(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitResponse(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun response(): ResponseContext {
        var _localctx = ResponseContext(context, state)
        enterRule(_localctx, 46, Rules.response.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 264
                match(AT)
                this.state = 265
                match(RESPONSE)
                this.state = 266
                returnCode()
                this.state = 267
                match(LEFT_BRACE)
                this.state = 268
                match(DATA_TYPE)
                this.state = 269
                match(RIGHT_BRACE)
                this.state = 270
                match(DATA_TYPE)
                this.state = 271
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun HEADER(): TerminalNode? = getToken(Tokens.HEADER.id, 0)
        public fun findReturnCode(): ReturnCodeContext? = getRuleContext(ReturnCodeContext::class, 0)
        public fun LEFT_BRACE(): TerminalNode? = getToken(Tokens.LEFT_BRACE.id, 0)
        public fun DATA_TYPE(): List<TerminalNode> = getTokens(Tokens.DATA_TYPE.id)
        public fun DATA_TYPE(i: Int): TerminalNode = getToken(Tokens.DATA_TYPE.id, i)!!
        public fun RIGHT_BRACE(): TerminalNode? = getToken(Tokens.RIGHT_BRACE.id, 0)
        public fun findComment(): CommentContext? = getRuleContext(CommentContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterHeader(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitHeader(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitHeader(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun header(): HeaderContext {
        var _localctx = HeaderContext(context, state)
        enterRule(_localctx, 48, Rules.header.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 273
                match(AT)
                this.state = 274
                match(HEADER)
                this.state = 275
                returnCode()
                this.state = 276
                match(LEFT_BRACE)
                this.state = 277
                match(DATA_TYPE)
                this.state = 278
                match(RIGHT_BRACE)
                this.state = 279
                match(DATA_TYPE)
                this.state = 280
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
    public open class ReturnCodeContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.returnCode.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun DIGITS(): TerminalNode? = getToken(Tokens.DIGITS.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterReturnCode(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitReturnCode(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitReturnCode(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun returnCode(): ReturnCodeContext {
        var _localctx = ReturnCodeContext(context, state)
        enterRule(_localctx, 50, Rules.returnCode.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 282
                match(DIGITS)
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

        public fun AT(): TerminalNode? = getToken(Tokens.AT.id, 0)
        public fun ROUTER(): TerminalNode? = getToken(Tokens.ROUTER.id, 0)
        public fun findPath(): PathContext? = getRuleContext(PathContext::class, 0)
        public fun LEFT_BRACKET(): TerminalNode? = getToken(Tokens.LEFT_BRACKET.id, 0)
        public fun findHttpMethod(): HttpMethodContext? = getRuleContext(HttpMethodContext::class, 0)
        public fun RIGHT_BRACKET(): TerminalNode? = getToken(Tokens.RIGHT_BRACKET.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterRouter(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitRouter(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitRouter(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun router(): RouterContext {
        var _localctx = RouterContext(context, state)
        enterRule(_localctx, 52, Rules.router.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 284
                match(AT)
                this.state = 285
                match(ROUTER)
                this.state = 286
                path()
                this.state = 287
                match(LEFT_BRACKET)
                this.state = 288
                httpMethod()
                this.state = 289
                match(RIGHT_BRACKET)
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


        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterPath(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitPath(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitPath(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun path(): PathContext {
        var _localctx = PathContext(context, state)
        enterRule(_localctx, 54, Rules.path.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
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
    public open class HttpMethodContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.httpMethod.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun GET(): TerminalNode? = getToken(Tokens.GET.id, 0)
        public fun POST(): TerminalNode? = getToken(Tokens.POST.id, 0)
        public fun PUT(): TerminalNode? = getToken(Tokens.PUT.id, 0)
        public fun DELETE(): TerminalNode? = getToken(Tokens.DELETE.id, 0)
        public fun PATCH(): TerminalNode? = getToken(Tokens.PATCH.id, 0)
        public fun HEAD(): TerminalNode? = getToken(Tokens.HEAD.id, 0)
        public fun OPTIONS(): TerminalNode? = getToken(Tokens.OPTIONS.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterHttpMethod(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitHttpMethod(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitHttpMethod(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun httpMethod(): HttpMethodContext {
        var _localctx = HttpMethodContext(context, state)
        enterRule(_localctx, 56, Rules.httpMethod.id)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 293
                _la = _input.LA(1)

                if (!((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 17454747090944L) != 0L))) {
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
    public open class ExtensionsContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.extensions.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun EXTENSION_MARK(): TerminalNode? = getToken(Tokens.EXTENSION_MARK.id, 0)
        public fun findJson(): JsonContext? = getRuleContext(JsonContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterExtensions(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitExtensions(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitExtensions(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun extensions(): ExtensionsContext {
        var _localctx = ExtensionsContext(context, state)
        enterRule(_localctx, 58, Rules.extensions.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 295
                match(EXTENSION_MARK)
                this.state = 296
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
    public open class JsonContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.json.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun findValue(): ValueContext? = getRuleContext(ValueContext::class, 0)
        public fun EOF(): TerminalNode? = getToken(Tokens.EOF.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.enterJson(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitJson(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitJson(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun json(): JsonContext {
        var _localctx = JsonContext(context, state)
        enterRule(_localctx, 60, Rules.json.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 298
                value()
                this.state = 299
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
            if (listener is SwagListener) {
                listener.enterObj(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitObj(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitObj(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun obj(): ObjContext {
        var _localctx = ObjContext(context, state)
        enterRule(_localctx, 62, Rules.obj.id)
        var _la: Int

        try {
            this.state = 314
            errorHandler.sync(this)

            when (interpreter.adaptivePredict(_input, 9, context)) {
                1 -> {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 301
                        match(LEFT_BRACE)
                        this.state = 302
                        pair()
                        this.state = 307
                        errorHandler.sync(this)
                        _la = _input.LA(1)

                        while (_la == COMMA) {
                            if (true) {
                                if (true) {
                                    this.state = 303
                                    match(COMMA)
                                    this.state = 304
                                    pair()
                                }
                            }
                            this.state = 309
                            errorHandler.sync(this)
                            _la = _input.LA(1)
                        }
                        this.state = 310
                        match(RIGHT_BRACE)
                    }
                }2 -> {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 312
                        match(LEFT_BRACE)
                        this.state = 313
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
            if (listener is SwagListener) {
                listener.enterPair(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitPair(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitPair(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun pair(): PairContext {
        var _localctx = PairContext(context, state)
        enterRule(_localctx, 64, Rules.pair.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 316
                match(STRING)
                this.state = 317
                match(COLON)
                this.state = 318
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
            if (listener is SwagListener) {
                listener.enterArr(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitArr(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitArr(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun arr(): ArrContext {
        var _localctx = ArrContext(context, state)
        enterRule(_localctx, 66, Rules.arr.id)
        var _la: Int

        try {
            this.state = 333
            errorHandler.sync(this)

            when (interpreter.adaptivePredict(_input, 11, context)) {
                1 -> {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 320
                        match(LEFT_BRACKET)
                        this.state = 321
                        value()
                        this.state = 326
                        errorHandler.sync(this)
                        _la = _input.LA(1)

                        while (_la == COMMA) {
                            if (true) {
                                if (true) {
                                    this.state = 322
                                    match(COMMA)
                                    this.state = 323
                                    value()
                                }
                            }
                            this.state = 328
                            errorHandler.sync(this)
                            _la = _input.LA(1)
                        }
                        this.state = 329
                        match(RIGHT_BRACKET)
                    }
                }2 -> {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 331
                        match(LEFT_BRACKET)
                        this.state = 332
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
            if (listener is SwagListener) {
                listener.enterValue(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SwagListener) {
                listener.exitValue(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is SwagVisitor) {
                return visitor.visitValue(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun value(): ValueContext {
        var _localctx = ValueContext(context, state)
        enterRule(_localctx, 68, Rules.value.id)

        try {
            this.state = 342
            errorHandler.sync(this)

            when (_input.LA(1)) {
                STRING -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 335
                        match(STRING)
                    }
                }NUMBER -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 336
                        match(NUMBER)
                    }
                }LEFT_BRACE -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 3)
                    if (true) {
                        this.state = 337
                        obj()
                    }
                }LEFT_BRACKET -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 4)
                    if (true) {
                        this.state = 338
                        arr()
                    }
                }TRUE -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 5)
                    if (true) {
                        this.state = 339
                        match(TRUE)
                    }
                }FALSE -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 6)
                    if (true) {
                        this.state = 340
                        match(FALSE)
                    }
                }NULL -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 7)
                    if (true) {
                        this.state = 341
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