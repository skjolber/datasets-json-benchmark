package org.nvd.json.jsoniter.generator;

import java.util.List;

import org.nvd.json.jsoniter.reduced.DefCpeMatch;
import org.nvd.json.jsoniter.reduced.DefCveItem;
import org.nvd.json.jsoniter.reduced.DefNode;
import org.nvd.json.jsoniter.reduced.LangString;
import org.nvd.json.jsoniter.reduced.ProblemtypeDatum;
import org.nvd.json.jsoniter.reduced.Reference;

import com.jsoniter.JsonIterator;
import com.jsoniter.output.EncodingMode;
import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.DecodingMode;
import com.jsoniter.spi.JsoniterSpi;
import com.jsoniter.spi.TypeLiteral;
import com.jsoniter.spi.Config.Builder;
import com.jsoniter.static_codegen.StaticCodegenConfig;

public class DemoCodegenConfig implements StaticCodegenConfig {

    @Override
    public void setup() {
        // register custom decoder or extensions before codegen
        // so that we doing codegen, we know in which case, we need to callback
        JsonIterator.setMode(DecodingMode.STATIC_MODE);
        JsonStream.setMode(EncodingMode.STATIC_MODE);
        
        JsoniterSpi.addNewDecoder("jsoniter_codegen.cfg9223372036100299902.decoder.java.util.List_org.nvd.json.jsoniter.reduced.DefNode", new jsoniter_codegen.cfg9223372036100299902.decoder.java.util.List_org.nvd.json.jsoniter.reduced.DefNode());
        /*
        JsoniterSpi.registerPropertyDecoder(User.class, "score", new Decoder.IntDecoder() {
            @Override
            public int decodeInt(JsonIterator iter) throws IOException {
                return Integer.valueOf(iter.readString());
            }
        });
        */
    }

    @Override
    public TypeLiteral[] whatToCodegen() {
        return new TypeLiteral[]{
                TypeLiteral.create(DefCveItem.class),
                new TypeLiteral<List<DefCveItem>>() {
                },
                new TypeLiteral<List<Reference>>() {
                },
                new TypeLiteral<List<ProblemtypeDatum>>() {
                },
                new TypeLiteral<List<LangString>>() {
                },
                new TypeLiteral<List<DefNode>>() {
                },
                new TypeLiteral<List<DefCveItem>>() {
                },
                new TypeLiteral<List<DefCpeMatch>>() {
                }
        };
    }
}