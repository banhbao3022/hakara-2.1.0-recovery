package p555j.p556a.p557a.p558a.p559a.p590r;

import java.io.File;
import java.util.List;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p114h.p122b.C0868a;
import p007c.p114h.p126d.p129c.p139g.FilterHelper;
import p007c.p114h.p126d.p129c.p139g.MakeupHelper;
import p007c.p114h.p126d.p129c.p139g.ResourceBaseHelper;
import p007c.p114h.p126d.p129c.p139g.ResourceHelper;
import p007c.p114h.p126d.p129c.p139g.p140i.ResourceData;
import p007c.p114h.p126d.p129c.p139g.p140i.ResourceType2;

/* JADX INFO: renamed from: j.a.a.a.a.r.n */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6810n implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SingActivity f31906f;

    public RunnableC6810n(SingActivity singActivity) {
        this.f31906f = singActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ResourceType2 resourceType2 = ResourceType2.NONE;
        ResourceType2 resourceType3 = ResourceType2.FILTER;
        SingActivity singActivity = this.f31906f;
        C0868a.m2106b(ResourceHelper.m2170c(singActivity));
        List<ResourceData> list = ResourceHelper.f4202a;
        list.clear();
        ResourceType2 resourceType4 = ResourceType2.STICKER;
        list.add(new ResourceData("cat", "assets://resource/cat.zip", resourceType4, "cat", "assets://thumbs/resource/cat.png"));
        list.add(new ResourceData("test_sticker1", "assets://resource/test_sticker1.zip", resourceType4, "test_sticker1", "assets://thumbs/resource/sticker_temp.png"));
        list.add(new ResourceData("triple_frame", "assets://resource/triple_frame.zip", resourceType3, "triple_frame", "assets://thumbs/resource/triple_frame.png"));
        list.add(new ResourceData("horizontal_mirror", "assets://resource/horizontal_mirror.zip", resourceType3, "horizontal_mirror", "assets://thumbs/resource/horizontal_mirror.png"));
        list.add(new ResourceData("vertical_mirror", "assets://resource/vertical_mirror.zip", resourceType3, "vertical_mirror", "assets://thumbs/resource/vertical_mirror.png"));
        File file = new File(ResourceHelper.m2170c(singActivity));
        if (file.exists() ? file.isDirectory() : file.mkdirs()) {
            String strM2170c = ResourceHelper.m2170c(singActivity);
            for (ResourceData resourceData : list) {
                if (resourceData.f4206b.f4215m >= 0) {
                    if (resourceData.f4205a.startsWith("assets://")) {
                        ResourceBaseHelper.m2163a(singActivity, resourceData.f4205a.substring(9), resourceData.f4207c, strM2170c);
                    } else if (resourceData.f4205a.startsWith("file://")) {
                        ResourceBaseHelper.m2164b(resourceData.f4205a.substring(7), resourceData.f4207c, strM2170c);
                    }
                }
            }
        }
        SingActivity singActivity2 = this.f31906f;
        C0868a.m2106b(FilterHelper.m2161c(singActivity2));
        List<ResourceData> list2 = FilterHelper.f4194a;
        list2.clear();
        list2.add(new ResourceData("none", "assets://filter/none.zip", resourceType2, "none", "assets://thumbs/filter/source.png"));
        list2.add(new ResourceData("amaro", "assets://filter/amaro.zip", resourceType3, "amaro", "assets://thumbs/filter/amaro.png"));
        list2.add(new ResourceData("anitque", "assets://filter/anitque.zip", resourceType3, "anitque", "assets://thumbs/filter/anitque.png"));
        list2.add(new ResourceData("blackcat", "assets://filter/blackcat.zip", resourceType3, "blackcat", "assets://thumbs/filter/blackcat.png"));
        list2.add(new ResourceData("blackwhite", "assets://filter/blackwhite.zip", resourceType3, "blackwhite", "assets://thumbs/filter/blackwhite.png"));
        list2.add(new ResourceData("brooklyn", "assets://filter/brooklyn.zip", resourceType3, "brooklyn", "assets://thumbs/filter/brooklyn.png"));
        list2.add(new ResourceData("calm", "assets://filter/calm.zip", resourceType3, "calm", "assets://thumbs/filter/calm.png"));
        list2.add(new ResourceData("cool", "assets://filter/cool.zip", resourceType3, "cool", "assets://thumbs/filter/cool.png"));
        list2.add(new ResourceData("earlybird", "assets://filter/earlybird.zip", resourceType3, "earlybird", "assets://thumbs/filter/earlybird.png"));
        list2.add(new ResourceData("emerald", "assets://filter/emerald.zip", resourceType3, "emerald", "assets://thumbs/filter/emerald.png"));
        list2.add(new ResourceData("fairytale", "assets://filter/fairytale.zip", resourceType3, "fairytale", "assets://thumbs/filter/fairytale.png"));
        list2.add(new ResourceData("freud", "assets://filter/freud.zip", resourceType3, "freud", "assets://thumbs/filter/freud.png"));
        list2.add(new ResourceData("healthy", "assets://filter/healthy.zip", resourceType3, "healthy", "assets://thumbs/filter/healthy.png"));
        list2.add(new ResourceData("hefe", "assets://filter/hefe.zip", resourceType3, "hefe", "assets://thumbs/filter/hefe.png"));
        list2.add(new ResourceData("hudson", "assets://filter/hudson.zip", resourceType3, "hudson", "assets://thumbs/filter/hudson.png"));
        list2.add(new ResourceData("kevin", "assets://filter/kevin.zip", resourceType3, "kevin", "assets://thumbs/filter/kevin.png"));
        list2.add(new ResourceData("latte", "assets://filter/latte.zip", resourceType3, "latte", "assets://thumbs/filter/latte.png"));
        list2.add(new ResourceData("lomo", "assets://filter/lomo.zip", resourceType3, "lomo", "assets://thumbs/filter/lomo.png"));
        list2.add(new ResourceData("romance", "assets://filter/romance.zip", resourceType3, "romance", "assets://thumbs/filter/romance.png"));
        list2.add(new ResourceData("sakura", "assets://filter/sakura.zip", resourceType3, "sakura", "assets://thumbs/filter/sakura.png"));
        list2.add(new ResourceData("sketch", "assets://filter/sketch.zip", resourceType3, "sketch", "assets://thumbs/filter/sketch.png"));
        list2.add(new ResourceData("sunset", "assets://filter/sunset.zip", resourceType3, "sunset", "assets://thumbs/filter/sunset.png"));
        list2.add(new ResourceData("whitecat", "assets://filter/whitecat.zip", resourceType3, "whitecat", "assets://thumbs/filter/whitecat.png"));
        File file2 = new File(FilterHelper.m2161c(singActivity2));
        if (file2.exists() ? file2.isDirectory() : file2.mkdirs()) {
            String strM2161c = FilterHelper.m2161c(singActivity2);
            for (ResourceData resourceData2 : list2) {
                if (resourceData2.f4206b.f4215m >= 0) {
                    if (resourceData2.f4205a.startsWith("assets://")) {
                        ResourceBaseHelper.m2163a(singActivity2, resourceData2.f4205a.substring(9), resourceData2.f4207c, strM2161c);
                    } else if (resourceData2.f4205a.startsWith("file://")) {
                        ResourceBaseHelper.m2164b(resourceData2.f4205a.substring(7), resourceData2.f4207c, strM2161c);
                    }
                }
            }
        }
        SingActivity singActivity3 = this.f31906f;
        C0868a.m2106b(MakeupHelper.m2162c(singActivity3));
        List<ResourceData> list3 = MakeupHelper.f4195a;
        list3.clear();
        list3.add(new ResourceData("none", "assets://makeup/none.zip", resourceType2, "none", "assets://thumbs/makeup/none.png"));
        list3.add(new ResourceData("ls01", "assets://makeup/ls01.zip", ResourceType2.MAKEUP, "ls01", "assets://thumbs/makeup/ls01.png"));
        File file3 = new File(MakeupHelper.m2162c(singActivity3));
        if (file3.exists() ? file3.isDirectory() : file3.mkdirs()) {
            String strM2162c = MakeupHelper.m2162c(singActivity3);
            for (ResourceData resourceData3 : list3) {
                if (resourceData3.f4206b.f4215m >= 0) {
                    if (resourceData3.f4205a.startsWith("assets://")) {
                        ResourceBaseHelper.m2163a(singActivity3, resourceData3.f4205a.substring(9), resourceData3.f4207c, strM2162c);
                    } else if (resourceData3.f4205a.startsWith("file://")) {
                        ResourceBaseHelper.m2164b(resourceData3.f4205a.substring(7), resourceData3.f4207c, strM2162c);
                    }
                }
            }
        }
    }
}
