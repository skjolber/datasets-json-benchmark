package jsoniter_codegen.cfg9223372036100299902.decoder.java.util.List_org.nvd.json.jsoniter.reduced;
public class Reference implements com.jsoniter.spi.Decoder {
public static java.lang.Object decode_(com.jsoniter.JsonIterator iter) throws java.io.IOException { java.util.ArrayList col = (java.util.ArrayList)com.jsoniter.CodegenAccess.resetExistingObject(iter);
if (iter.readNull()) { com.jsoniter.CodegenAccess.resetExistingObject(iter); return null; }
if (!com.jsoniter.CodegenAccess.readArrayStart(iter)) {
return col == null ? new java.util.ArrayList(0): (java.util.ArrayList)com.jsoniter.CodegenAccess.reuseCollection(col);
}
Object a1 = (org.nvd.json.jsoniter.reduced.Reference)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.Reference.decode_(iter);
if (com.jsoniter.CodegenAccess.nextToken(iter) != ',') {
java.util.ArrayList obj = col == null ? new java.util.ArrayList(1): (java.util.ArrayList)com.jsoniter.CodegenAccess.reuseCollection(col);
obj.add(a1);
return obj;
}
Object a2 = (org.nvd.json.jsoniter.reduced.Reference)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.Reference.decode_(iter);
if (com.jsoniter.CodegenAccess.nextToken(iter) != ',') {
java.util.ArrayList obj = col == null ? new java.util.ArrayList(2): (java.util.ArrayList)com.jsoniter.CodegenAccess.reuseCollection(col);
obj.add(a1);
obj.add(a2);
return obj;
}
Object a3 = (org.nvd.json.jsoniter.reduced.Reference)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.Reference.decode_(iter);
if (com.jsoniter.CodegenAccess.nextToken(iter) != ',') {
java.util.ArrayList obj = col == null ? new java.util.ArrayList(3): (java.util.ArrayList)com.jsoniter.CodegenAccess.reuseCollection(col);
obj.add(a1);
obj.add(a2);
obj.add(a3);
return obj;
}
Object a4 = (org.nvd.json.jsoniter.reduced.Reference)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.Reference.decode_(iter);
java.util.ArrayList obj = col == null ? new java.util.ArrayList(8): (java.util.ArrayList)com.jsoniter.CodegenAccess.reuseCollection(col);
obj.add(a1);
obj.add(a2);
obj.add(a3);
obj.add(a4);
while (com.jsoniter.CodegenAccess.nextToken(iter) == ',') {
obj.add((org.nvd.json.jsoniter.reduced.Reference)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.Reference.decode_(iter));
}
return obj;
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
