package p007c.p190n.p194b.p209b.p234u1.p238l;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.MetadataInputBuffer;
import p007c.p190n.p194b.p209b.p234u1.SimpleMetadataDecoder;
import p007c.p190n.p378c.p379a.Charsets;

/* JADX INFO: renamed from: c.n.b.b.u1.l.a, reason: use source file name */
/* JADX INFO: compiled from: IcyDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class IcyDecoder extends SimpleMetadataDecoder {

    /* JADX INFO: renamed from: a */
    public static final Pattern f8698a = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: b */
    public final CharsetDecoder f8699b = Charsets.f26131c.newDecoder();

    /* JADX INFO: renamed from: c */
    public final CharsetDecoder f8700c = Charsets.f26130b.newDecoder();

    @Override // p007c.p190n.p194b.p209b.p234u1.SimpleMetadataDecoder
    /* JADX INFO: renamed from: b */
    public Metadata mo4018b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        String string;
        String str = null;
        try {
            string = this.f8699b.decode(byteBuffer).toString();
            this.f8699b.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            this.f8699b.reset();
            byteBuffer.rewind();
            try {
                string = this.f8700c.decode(byteBuffer).toString();
                this.f8700c.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f8700c.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                this.f8700c.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            this.f8699b.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f8698a.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strM3111T = Util6.m3111T(matcher.group(1));
            String strGroup = matcher.group(2);
            if (strM3111T != null) {
                if (strM3111T.equals("streamurl")) {
                    str2 = strGroup;
                } else if (strM3111T.equals("streamtitle")) {
                    str = strGroup;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
