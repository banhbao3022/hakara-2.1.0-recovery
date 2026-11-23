package p007c.p190n.p194b.p209b.p234u1;

import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p234u1.p235i.AppInfoTableDecoder;
import p007c.p190n.p194b.p209b.p234u1.p236j.EventMessageDecoder;
import p007c.p190n.p194b.p209b.p234u1.p238l.IcyDecoder;
import p007c.p190n.p194b.p209b.p234u1.p239m.Id3Decoder;
import p007c.p190n.p194b.p209b.p234u1.p241o.SpliceInfoDecoder;

/* JADX INFO: renamed from: c.n.b.b.u1.d, reason: use source file name */
/* JADX INFO: compiled from: MetadataDecoderFactory.java */
/* JADX INFO: loaded from: classes.dex */
public interface MetadataDecoderFactory {

    /* JADX INFO: renamed from: a */
    public static final MetadataDecoderFactory f8662a = new a();

    /* JADX INFO: renamed from: c.n.b.b.u1.d$a */
    /* JADX INFO: compiled from: MetadataDecoderFactory.java */
    public class a implements MetadataDecoderFactory {
        @Override // p007c.p190n.p194b.p209b.p234u1.MetadataDecoderFactory
        /* JADX INFO: renamed from: a */
        public boolean mo4015a(Format format) {
            String str = format.f6934q;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // p007c.p190n.p194b.p209b.p234u1.MetadataDecoderFactory
        /* JADX INFO: renamed from: b */
        public MetadataDecoder mo4016b(Format format) {
            String str = format.f6934q;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new AppInfoTableDecoder();
                    case "application/x-icy":
                        return new IcyDecoder();
                    case "application/id3":
                        return new Id3Decoder();
                    case "application/x-emsg":
                        return new EventMessageDecoder();
                    case "application/x-scte35":
                        return new SpliceInfoDecoder();
                }
            }
            throw new IllegalArgumentException(outline.m1599u("Attempted to create decoder for unsupported MIME type: ", str));
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo4015a(Format format);

    /* JADX INFO: renamed from: b */
    MetadataDecoder mo4016b(Format format);
}
