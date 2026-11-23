package p007c.p451o.p452a;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mtp.media.karaoke.R;
import p007c.p451o.p452a.p460d.ImageLoader;
import p007c.p451o.p452a.p461e.p463b.BuilderData;
import p007c.p451o.p452a.p461e.p464c.ImageViewerDialog;

/* JADX INFO: renamed from: c.o.a.b, reason: use source file name */
/* JADX INFO: compiled from: StfalconImageViewer.java */
/* JADX INFO: loaded from: classes.dex */
public class StfalconImageViewer<T> {

    /* JADX INFO: renamed from: a */
    public Context f27812a;

    /* JADX INFO: renamed from: b */
    public BuilderData<T> f27813b;

    /* JADX INFO: renamed from: c */
    public ImageViewerDialog<T> f27814c;

    /* JADX INFO: renamed from: c.o.a.b$a */
    /* JADX INFO: compiled from: StfalconImageViewer.java */
    public static class a<T> {

        /* JADX INFO: renamed from: a */
        public Context f27815a;

        /* JADX INFO: renamed from: b */
        public BuilderData<T> f27816b;

        public a(Context context, T[] tArr, ImageLoader<T> imageLoader) {
            this(context, new ArrayList(Arrays.asList(tArr)), imageLoader);
        }

        /* JADX INFO: renamed from: a */
        public StfalconImageViewer<T> m12472a() {
            Context context = this.f27815a;
            BuilderData<T> builderData = this.f27816b;
            StfalconImageViewer<T> stfalconImageViewer = new StfalconImageViewer<>(context, builderData);
            if (builderData.f27876h.isEmpty()) {
                Log.w(stfalconImageViewer.f27812a.getString(R.string.library_name), "Images list cannot be empty! Viewer ignored.");
            } else {
                ImageViewerDialog<T> imageViewerDialog = stfalconImageViewer.f27814c;
                imageViewerDialog.f27880c = true;
                imageViewerDialog.f27878a.show();
            }
            return stfalconImageViewer;
        }

        public a(Context context, List<T> list, ImageLoader<T> imageLoader) {
            this.f27815a = context;
            this.f27816b = new BuilderData<>(list, imageLoader);
        }
    }

    public StfalconImageViewer(Context context, BuilderData<T> builderData) {
        this.f27812a = context;
        this.f27813b = builderData;
        this.f27814c = new ImageViewerDialog<>(context, builderData);
    }
}
